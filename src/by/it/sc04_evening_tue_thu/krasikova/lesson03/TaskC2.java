package by.it.sc04_evening_tue_thu.krasikova.lesson03;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ввод:");
        int i=sc.nextInt();
        System.out.print(i);
        System.out.print(" ");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("");
        System.out.println("Вывод:");
        System.out.print("DEC:");
        System.out.print(i);
        System.out.print("+");
        System.out.print(a);
        System.out.print("=");
        int sum = i + a;
        System.out.println(sum);
        System.out.print("BIN:");
        System.out.print(Integer.toBinaryString(i));
        System.out.print("+");
        System.out.print(Integer.toBinaryString(a));
        System.out.print("=");
        System.out.println(Integer.toBinaryString(sum));
        System.out.print("HEX:");
        System.out.print(Integer.toHexString(i));
        System.out.print("+");
        System.out.print(Integer.toHexString(a));
        System.out.print("=");
        System.out.println(Integer.toHexString(sum));
        System.out.print("OKT:");
        System.out.print(Integer.toOctalString(i));
        System.out.print("+");
        System.out.print(Integer.toOctalString(a));
        System.out.print("=");
        System.out.println(Integer.toOctalString(sum));

    }

}

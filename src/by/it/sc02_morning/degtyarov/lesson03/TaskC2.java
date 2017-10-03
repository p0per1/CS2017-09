package by.it.sc02_morning.degtyarov.lesson03;

import java.util.Scanner;

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
class TaskC2 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int sum = i+j;
           System.out.println("DEC:" + i + "+" + j + "=" + sum);

           System.out.print("BIN:");
           System.out.print(Integer.toBinaryString(i));
           System.out.print("+");
           System.out.print(Integer.toBinaryString(j));
           System.out.print("=");
           System.out.println(Integer.toBinaryString(sum));

           System.out.print("HEX:");
           System.out.print(Integer.toHexString(i));
           System.out.print("+");
           System.out.print(Integer.toHexString(j));
           System.out.print("=");
           System.out.println(Integer.toHexString(sum));

           System.out.print("OKT:");
           System.out.print(Integer.toOctalString(i));
           System.out.print("+");
           System.out.print(Integer.toOctalString(j));
           System.out.print("=");
           System.out.println(Integer.toOctalString(sum));


    }

}

package by.it.sc03_evening_mon_fri.kalita.lesson03;

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
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b=in.nextInt();
        System.out.printf("%s%d%s%d%s%d%n", "DEC:", a,"+",b,"=",a+b);
        System.out.printf("%s%s%s%s%s%s%n", "BIN:", Integer.toBinaryString(a),"+",Integer.toBinaryString(b),"=",Integer.toBinaryString(a+b));
        System.out.printf("%s%x%s%x%s%x%n", "HEX:", a,"+",b,"=",a+b);
        System.out.printf("%s%o%s%o%s%o%n", "OKT:", a,"+",b,"=",a+b);
    }


}

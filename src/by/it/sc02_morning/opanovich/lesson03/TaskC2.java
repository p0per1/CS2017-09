package by.it.sc02_morning.opanovich.lesson03;

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

        Scanner rd = new Scanner(System.in);
        int a = rd.nextInt();
        int b = rd.nextInt();
        int c = a + b;

        System.out.printf("DEC:%d+%d=%d%n", a, b, c);
        System.out.printf("BIN:%s+%s=%s%n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        System.out.printf("HEX:%s+%s=%s%n", Integer.toHexString(a), Integer.toHexString(b), Integer.toHexString(c));

        // better change OKT: to OCT:
        System.out.printf("OKT:%s+%s=%s%n", Integer.toOctalString(a), Integer.toOctalString(b), Integer.toOctalString(c));
    }
}

package by.it.sc02_morning.liplianina.lesson03;

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
class TaskC2 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int resten = a + b;
    System.out.println("DEC:" + a + "+" + b + "=" + resten);

    String binary1 = Integer.toBinaryString(a);
    String binary2 = Integer.toBinaryString(b);
    String resbinary = Integer.toBinaryString(resten);
    System.out.println("BIN:" + binary1 + "+" + binary2 + "=" + resbinary);

    String hex1 = Integer.toHexString(a);
    String hex2 = Integer.toHexString(b);
    String reshex = Integer.toHexString(resten);
    System.out.println("HEX:" + hex1 + "+" + hex2 + "=" + reshex);

    String octal1 = Integer.toOctalString(a);
    String octal2 = Integer.toOctalString(b);
    String resoctal = Integer.toOctalString(resten);
    System.out.println("OKT:" + octal1 + "+" + octal2 + "=" + resoctal);
    }
}

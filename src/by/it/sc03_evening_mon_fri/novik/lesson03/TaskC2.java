package by.it.sc03_evening_mon_fri.novik.lesson03;

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

        Scanner scanner = new Scanner(System.in);

        int firstInt = scanner.nextInt();

        int secondInt = scanner.nextInt();

        System.out.println("DEC:" + firstInt + "+" + secondInt + "=" + (firstInt + secondInt));

        System.out.println("BIN:" + Integer.toBinaryString(firstInt) + "+" + Integer.toBinaryString(secondInt) + "=" +
                Integer.toBinaryString(firstInt + secondInt));

        System.out.println("HEX:" + Integer.toHexString(firstInt) + "+" + Integer.toHexString(secondInt) + "=" +
                Integer.toHexString(firstInt + secondInt));

        System.out.println("OKT:" + Integer.toOctalString(firstInt) + "+" + Integer.toOctalString(secondInt) + "=" +
                Integer.toOctalString(firstInt + secondInt));

    }

}

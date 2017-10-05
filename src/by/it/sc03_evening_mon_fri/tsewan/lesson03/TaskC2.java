package by.it.sc03_evening_mon_fri.tsewan.lesson03;

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
        int Sum = i + j;

        {
            System.out.println("DEC:" + Integer.toString(i, 1) + "+" + Integer.toString(j, 1) + "=" + Sum);
            System.out.println("BIN:" + Integer.toString(i, 2) + "+" + Integer.toString(j, 2) + "=");
            System.out.println("HEX:"+Integer.toString(i, 16)+"+"+Integer.toString(j, 16)+"=");
            System.out.println("OKT:"+Integer.toString(i, 8)+"+"+Integer.toString(j, 8)+"=");
        }
    }
}
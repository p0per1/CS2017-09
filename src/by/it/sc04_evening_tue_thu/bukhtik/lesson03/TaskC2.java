package by.it.sc04_evening_tue_thu.bukhtik.lesson03;

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
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k= i+j;

        String bin_i = Integer.toBinaryString(i);
        String bin_j = Integer.toBinaryString(j);
        String bin_k = Integer.toBinaryString(k);

        String hex_i = Integer.toString(i,16);
        String hex_j = Integer.toString(j,16);
        String hex_k = Integer.toString(k,16);

        String okt_i = Integer.toString(i,8);
        String okt_j = Integer.toString(j,8);
        String okt_k = Integer.toString(k,8);

        System.out.println("DEC:" + i + "+" + j + "=" + k);
        System.out.println("BIN:" + bin_i + "+" + bin_j + "=" + bin_k);
        System.out.println("HEX:" + hex_i + "+" + hex_j + "=" + hex_k);
        System.out.println("OKT:" + okt_i + "+" + okt_j + "=" + okt_k);

    }

}

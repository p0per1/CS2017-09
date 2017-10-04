package by.it.sc02_morning.lutskevichm.lesson03;

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
        Scanner scj=new Scanner(System.in);
        int j=scj.nextInt();
        int res=i+j;
        System.out.println("Вывод:");
        System.out.println("DEC:"+i+"+"+j+"="+res);
        System.out.println("BIN:"+Integer.toBinaryString(i)+"+"+Integer.toBinaryString(j)+"="+Integer.toBinaryString(res));
        System.out.println("HEX:"+Integer.toHexString(i)+"+"+Integer.toHexString(j) +"="+Integer.toHexString(res));
        System.out.println("OKT:"+Integer.toOctalString(i)+"+"+Integer.toOctalString(j)+"="+Integer.toOctalString(res));

    }


}

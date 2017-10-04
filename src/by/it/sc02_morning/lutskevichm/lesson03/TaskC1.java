package by.it.sc02_morning.lutskevichm.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        Scanner scj=new Scanner(System.in);
        int j=scj.nextInt();
        int res=i+j;
        System.out.println("Ввод:");
        System.out.println(i + " " + j);
        System.out.println();
        System.out.println("Вывод:");
        System.out.println("Sum = " + res);
    }



}

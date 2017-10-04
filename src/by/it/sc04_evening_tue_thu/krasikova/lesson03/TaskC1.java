package by.it.sc04_evening_tue_thu.krasikova.lesson03;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/

import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ввод:");
        int i=sc.nextInt();
        System.out.print(i);
        System.out.print(" ");
        int d=sc.nextInt();
        System.out.print(d);
        System.out.println("");
        int sum=i + d;
        System.out.print("Sum");
        System.out.print(" = ");
        System.out.println(sum);
    }


    }





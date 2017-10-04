package by.it.sc03_evening_mon_fri.kalita.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
public  static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int a1 = in.nextInt();
    int a2 = in.nextInt();
    System.out.println("Sum = " + (a1+a2));
}
}

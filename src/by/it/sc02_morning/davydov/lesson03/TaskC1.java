package by.it.sc02_morning.davydov.lesson03;

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
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan1.nextInt();

        int result = a + b;
        System.out.println("Sum = " + result);
    }




}

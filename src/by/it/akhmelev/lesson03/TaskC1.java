package by.it.akhmelev.lesson03;

import java.util.Scanner;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/
public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
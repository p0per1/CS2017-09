package by.it.sc03_evening_mon_fri.novik.lesson03;

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

        Scanner scanner = new Scanner(System.in);

        int firstInt = scanner.nextInt();

        int secondInt = scanner.nextInt();

        System.out.println("Sum = " + (firstInt + secondInt));

    }

}

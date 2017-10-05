package by.it.sc04_evening_tue_thu.rumiantsau.lesson03;

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
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        int result = a1 + a2;

        System.out.println("Sum = " + result);
    }
}

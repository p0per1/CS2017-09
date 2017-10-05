package by.it.sc04_evening_tue_thu.gimzhevsky.lesson03;

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
        Scanner sc = new Scanner(System.in);;
        int sum = 0;
        for (int i = 1; i<3; i++){
            sum = sum + sc.nextInt();
        }
        System.out.println("Sum = " + sum);
    }
}

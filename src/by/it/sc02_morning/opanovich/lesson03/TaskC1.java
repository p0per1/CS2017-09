package by.it.sc02_morning.opanovich.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {

    public static void main(String[] args) throws Exception{

        Scanner rd = new Scanner(System.in);
        int a = rd.nextInt();
        int b = rd.nextInt();

        System.out.println("Sum = " + (a + b));
    }
}

package by.it.sc02_morning.safronov.lesson03;

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
        Scanner sc= new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int res = s1 + s2;
        System.out.println("Sum" + " " + "=" + " " + res);
    }


}

package by.it.sc02_morning.golikov.lesson03;

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
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int i = sc1.nextInt();
        int j = sc2.nextInt();
        int result = i+j;
        System.out.println("Sum" + " " + "=" + " " + result);
    }


}

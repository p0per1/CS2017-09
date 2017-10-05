package by.it.sc02_morning.opanovich.lesson04;

import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-4.75 -5.25

Ввод:
2 4 2
Вывод:
-1

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        int a, b, c;
        double d;

        a = rd.nextInt();
        b = rd.nextInt();
        c = rd.nextInt();

        d = dis(a, b, c);

        if (d < 0) {
            System.out.println("Отрицательный дискриминант");
        } else if (d == 0) {
            System.out.println((double) -b / 2 / a);
        } else {
            System.out.println(d);
            System.out.print((-b + Math.sqrt(d)) / 2. / a + " ");
            System.out.println((-b - Math.sqrt(d)) / 2. / a);
        }
    }

    private static double dis(int a, int b, int c) {

        return (double) b * b - 4 * a * c;
    }
}

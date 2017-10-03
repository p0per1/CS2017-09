package by.it.sc02_morning.opanovich.lesson03;

import java.util.Scanner;
import static java.lang.Math.round;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)
Требования:
1. Метод getWeight(int) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {

    private static double G_MARS = 3.86;
    private static double G_EARTH = 9.81;

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        System.out.println(getWeight(rd.nextInt()));
    }

    static double getWeight(int weightEarth) {

        return round(weightEarth * G_MARS / G_EARTH * 100) / 100.;
    }
}

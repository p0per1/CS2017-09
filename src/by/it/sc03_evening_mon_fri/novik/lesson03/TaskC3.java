package by.it.sc03_evening_mon_fri.novik.lesson03;

import java.util.Scanner;
import java.math.BigDecimal;

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();

        double result = TaskC3.getWeight(weight);

        System.out.println(result);

    }

    static double getWeight(int weightOnEarth) {

        double weightOnMars = weightOnEarth * (3.86 / 9.81);

        return BigDecimal.valueOf(weightOnMars).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();

    }

}

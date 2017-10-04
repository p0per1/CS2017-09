package by.it.sc04_evening_tue_thu.sorokina.lesson03;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

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
    private static int a;

    public static void main( String[] args) {
        Scanner sc=new Scanner(System.in);
            int weightOnEarth=sc.nextInt();
            double weightOnMars = getWeight(weightOnEarth);

        weightOnMars = new BigDecimal(weightOnMars).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println(weightOnMars);

    }

static double getWeight(int a){
        return a/9.81*3.86;

}


}

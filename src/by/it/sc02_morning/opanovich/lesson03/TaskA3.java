package by.it.sc02_morning.opanovich.lesson03;
/*
Измените переменные и строку вывода в программе так,
чтобы она расчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        int k = i * i + j * j;
        System.out.printf("%d*%<d+%d*%<d=%d", i, j, k);
        //
    }
}

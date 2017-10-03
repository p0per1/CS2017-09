package by.it.sc02_morning.serzhan.lesson03;


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
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        int result=s1+s2;
        String sum;
        sum="Sum="+result;
        System.out.println(sum);
      //  Scanner sc = new Scanner(System.in);
      //  int i = sc.next();
        //int a=sc.next();
        //int result=i+a;
        //String sum;
        //sum="Sum="+result;
        //System.out.println(sum);
    }



}

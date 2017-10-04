package by.it.sc02_morning.patsko.lesson03;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("DEC:"+x+"+"+y+"="+(x+y));
        System.out.println("BIN:"+Integer.toBinaryString(x)+"+"+Integer.toBinaryString(y)+"="+Integer.toBinaryString(x+y));
        System.out.printf("HEX:%x+%x=%x\n",x,y,x+y );
        System.out.printf("OKT:%o+%o=%o\n",x,y,x+y );
    }


}

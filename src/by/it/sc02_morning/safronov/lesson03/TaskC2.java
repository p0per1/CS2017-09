package by.it.sc02_morning.safronov.lesson03;

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
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int res = s1 + s2;
        System.out.println("DEC:"+s1+"+"+s2+"="+res);
        System.out.println("BIN:"+Integer.toBinaryString((int)s1)+"+"+Integer.toBinaryString((int)s2)+"="+Integer.toBinaryString((int) res));
        System.out.println("HEX:"+Integer.toHexString((int)s1)+"+"+Integer.toHexString((int)s2)+"="+Integer.toHexString((int) res));
        System.out.println("OKT:"+Integer.toOctalString((int)s1)+"+"+Integer.toOctalString((int)s2)+"="+Integer.toOctalString((int) res));



    }
}


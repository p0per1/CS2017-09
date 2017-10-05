package by.it.sc02_morning.serzhan.lesson03;

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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = b + a;
        String dec = "DEC:";
        System.out.println(dec+ a+"+"+b+"="+result);
        //String convert = Integer.toBinaryString(a);
        //String conv = Integer.toBinaryString(b);
        //String con = Integer.toBinaryString(result);
        String bin = "BIN:";
     System.out.println(Integer.toBinaryString(result));
        //System.out.println(bin+a+"+"+b+"="+result);
       // convert = Integer.toOctalString(result);
     System.out.println(Integer.toOctalString(result));
        //convert = Integer. toHexString(result);
        System.out.println(Integer. toHexString(result));
        //System.out.println(Integer.toString(BIN:  "result", 2));
    }

    }

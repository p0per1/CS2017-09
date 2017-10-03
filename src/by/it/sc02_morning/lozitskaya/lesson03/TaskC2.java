package by.it.sc02_morning.lozitskaya.lesson03;

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
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int r = i+j;
        System.out.println("DEC:"+i+"+"+j+"="+r);
        String bini = Integer.toBinaryString(i);
        String binj = Integer.toBinaryString(j);
        String binr = Integer.toBinaryString(r);
        System.out.println("BIN:"+bini+"+"+binj+"="+binr);
        String hexi = Integer.toHexString(i);
        String hexj = Integer.toHexString(j);
        String hexr = Integer.toHexString(r);
        System.out.println("HEX:"+hexi+"+"+hexj+"="+hexr);
        String octi = Integer.toOctalString(i);
        String octj = Integer.toOctalString(j);
        String octr = Integer.toOctalString(r);
        System.out.println("OKT:"+octi+"+"+octj+"="+octr);
    }
}

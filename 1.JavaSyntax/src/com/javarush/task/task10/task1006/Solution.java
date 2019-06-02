package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        double d = (int) 2.50256e2d; //250.256
        char c = (short) 'd'; //d
        short s = (int) 2.22; //2
        int i = 150000; //1500
        float f = 0.50f; //0.5

//        double j = f + (i / c) - (int)(d * s);

        double result = f + (i / c) - (d * s) - 500e-3;

        System.out.println("result: " + result);
    }
}
package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e) {
            StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
            System.out.println(e.getStackTrace());
        }
    }

    public static void divideByZero () {
    int x = 2/0;
        System.out.println(x);
    }
}

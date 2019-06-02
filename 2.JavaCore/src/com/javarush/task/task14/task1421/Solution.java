package com.javarush.task.task14.task1421;

/* 
Singleton
*/
public class Solution {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        System.out.println(Singleton.getInstance(a,b));


    }
}

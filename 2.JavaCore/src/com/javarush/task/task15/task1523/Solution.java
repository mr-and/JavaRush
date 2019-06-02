package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {
    }

    public Solution(short a) {}

    private Solution(int a, int b) {}

    Solution(int a) {}

    protected Solution(double c) {}

}


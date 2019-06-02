package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1)
                break;
            else {

                    list.add(number);
                }

            }

        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }

        System.out.println(result/list.size());
    }
}



package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        try {
            int numStroke = Integer.parseInt(reader.readLine());
            for (int i = 0; i < numStroke; i++) {
             list.add(Integer.parseInt(reader.readLine()));
            }

        }
        catch (Exception e) {
            System.out.println("Внимание, ошибка ввода");
        }


        int maximum = Collections.max(list);

        System.out.println(maximum);
    }
}

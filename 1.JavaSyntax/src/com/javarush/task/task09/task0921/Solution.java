package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            for (int i = 0; i < 100000; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }


        } catch (IOException e) {
        } finally {
            for (Integer x : list) {
                System.out.println(x);
            }
        }
    }
}

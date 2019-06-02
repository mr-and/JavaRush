package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String ten = reader.readLine();
            array.add(0, ten);
        }
        for(String x : array) {
            System.out.println(x);
        }

    }


}


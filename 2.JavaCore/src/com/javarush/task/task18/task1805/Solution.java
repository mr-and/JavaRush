package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> list = new TreeSet<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(nameFile);

        while (fileInputStream.available()> 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

        for (Integer integer : list) {
            System.out.print(integer + " ");

        }

    }
}

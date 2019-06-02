package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        List<Integer> list = new ArrayList<>();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0) { list.add(fileInputStream.read()); }

        fileInputStream.close();


        HashMap<Integer, Integer> hm = new HashMap<>();

        Integer am;
        for (Integer i : list) {

            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }

        int minValues = Collections.min(hm.values());

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() == minValues) {
                System.out.print(e.getKey() + " ");
            }
        }


    }
}



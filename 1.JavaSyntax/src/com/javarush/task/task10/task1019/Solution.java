package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (true) {

            int id;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                break;
            }

            String name = reader.readLine();

            hashMap.put(name, id);

        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//            int value = entry.getValue();
//            String key = entry.getKey();
            System.out.println(entry.getValue() + " " + entry.getKey());

        }
    }

}



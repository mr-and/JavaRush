package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String filename = args[0];
        FileInputStream iStream = new FileInputStream("D:\\text.txt");

        Map<Integer, Integer> map = new TreeMap<>();

        while (iStream.available() > 0) {

            int data = iStream.read();

            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            }
            else {
                map.put(data, 1);
            }

        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {

            int key = pair.getKey();
            int value = pair.getValue();

            System.out.println((char) key + " " + value);
        }

        iStream.close();
    }
}

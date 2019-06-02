package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileNumber1 = reader.readLine();
        String fileNumber2 = reader.readLine();

        List<Integer> list = new ArrayList<Integer>();

        FileInputStream fileInputStream = new FileInputStream(fileNumber1);

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }

//        Collections.reverse(list);

        FileOutputStream fileOutputStream = new FileOutputStream(fileNumber2);

//        for (Integer integer : list) {
//            fileOutputStream.write(list.get(integer));
//
//        }
        for (int i = list.size()-1; i >= 0; i--) {
            fileOutputStream.write(list.get(i));
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}

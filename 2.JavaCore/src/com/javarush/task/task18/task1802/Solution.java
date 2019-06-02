package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальный байт
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> listFile = new ArrayList<>();

        String nameFileRead = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(nameFileRead);

        while (fileInputStream.available() > 0) {

            int byteCopyList = fileInputStream.read();

            listFile.add(byteCopyList);

        }

        reader.close();
        fileInputStream.close();



        Collections.sort(listFile);


        System.out.println(listFile.get(0));
    }


}

package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    private  static int countOfChar;

    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(nameFile);

        while (fileInputStream.available() > 0) {

            if(fileInputStream.read() == 44) {
                countOfChar++;
            }
        }

        fileInputStream.close();

        System.out.println(countOfChar);
    }
}

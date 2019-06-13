package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        String fileNameOne = reader.readLine();
        String fileNameTwo = reader.readLine();

        FileReader fileReader = new FileReader(fileNameOne);
        FileWriter fileWriter = new FileWriter(fileNameTwo);

        int i = 0;

        while (fileReader.ready()) {
            int data = fileReader.read();
            i++;
            if(i % 2 == 0) {
                fileWriter.write(data);
            }
        }





        reader.close();
        fileReader.close();
        fileWriter.close();

    }
}

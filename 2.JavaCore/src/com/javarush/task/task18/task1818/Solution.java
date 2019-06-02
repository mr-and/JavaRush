package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileNameOne = reader.readLine();
        String fileNameTwo = reader.readLine();
        String fileNameThree = reader.readLine();

        FileInputStream fileInputStreamTwo = new FileInputStream(fileNameTwo);
        FileInputStream fileInputStreamThree = new FileInputStream(fileNameThree);

        FileOutputStream fileOutputStreamOne = new FileOutputStream(fileNameOne, true);

        while (fileInputStreamTwo.available() > 0) {
            int data = fileInputStreamTwo.read();
            fileOutputStreamOne.write(data);
        }

        while (fileInputStreamThree.available() > 0) {
            int data = fileInputStreamThree.read();
            fileOutputStreamOne.write(data);
        }

        fileInputStreamTwo.close();
        fileInputStreamThree.close();
        fileOutputStreamOne.close();

//        D:\\text.txt


    }
}

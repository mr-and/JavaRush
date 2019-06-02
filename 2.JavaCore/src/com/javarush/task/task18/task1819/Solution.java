package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileNameFirst = reader.readLine();
        String fileNameSecond = reader.readLine();

        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(fileNameFirst);
        byte [] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        fileInputStream1.close();

        FileInputStream fileInputStream2 = new FileInputStream(fileNameSecond);
        byte [] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        fileInputStream2.close();


        byte[] bigbuff = new byte[buffer1.length + buffer2.length];
        System.arraycopy(buffer2, 0, bigbuff, 0, buffer2.length);
        System.arraycopy(buffer1, 0, bigbuff, buffer2.length, buffer1.length);

        FileOutputStream outputStream = new FileOutputStream(fileNameFirst);
        outputStream.write(bigbuff);
        outputStream.close();

    }
}

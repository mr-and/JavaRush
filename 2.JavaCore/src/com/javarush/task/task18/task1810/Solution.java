package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;
import java.nio.file.Files;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());

            if (fileInputStream.available() < 1000) {
                reader.close();
                fileInputStream.close();
            throw new DownloadException("Размер файла меньше 1000 байт");
            }
        }



//        D:\text.txt




    }

    public static class DownloadException extends Exception {

        public  DownloadException(String msg) {
            super(msg);

        }

    }
}

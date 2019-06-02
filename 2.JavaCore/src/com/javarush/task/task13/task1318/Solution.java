package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readMe = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(readMe.readLine());
        readMe.close();

        while (fis.available() > 0) {
            System.out.print((char)fis.read());
        }
        System.out.println();
        fis.close();
    }
}
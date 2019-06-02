package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int count = 0;
        while (fileInputStream.available() > 0)
        {
            Pattern pattern = Pattern.compile("[a-zA-Z]");
            Matcher matcher = pattern.matcher(Character.toString((char) fileInputStream.read()));
            count += matcher.matches()? 1 : 0;
        }
        System.out.print(count);

        fileInputStream.close();
    }

    }


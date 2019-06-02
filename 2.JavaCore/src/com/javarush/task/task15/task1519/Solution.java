package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String string = reader.readLine();
            if (string.equals("exit")) {
                break;
            }


            try {
                if (string.contains(".")) {
                    print(Double.parseDouble(string));
                }

                else if (Integer.parseInt(string) <= 0 || Integer.parseInt(string) >= 128) {
                    print(Integer.parseInt(string));
                }

                else if (Short.parseShort(string) > 0 && Short.parseShort(string) < 128) {
                    print(Short.parseShort(string));
                }

                else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                print(string);
            }

        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

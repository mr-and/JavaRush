package com.javarush.task.task19.task1904;


import com.sun.java_cup.internal.runtime.Symbol;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;
        private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

        @Override
        public Person read() throws Exception {
            if (fileScanner.hasNextLine()) {
                try {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(" ");
                    String dateLine = String.format("%s %s %s", parts[3], parts[4], parts[5]);
                    return new Person(parts[1], parts[2], parts[0], dateFormat.parse(dateLine));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }
    }
}

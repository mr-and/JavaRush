package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {

        // 1
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        // 2
        try {
            int[] mass = new int[6];
            mass[7] = 10;
        } catch (ArrayIndexOutOfBoundsException i) {
            exceptions.add(i);
        }

        // 3
        try {
            int [] a = new int[-1];
        }catch (NegativeArraySizeException r){
            exceptions.add(r);
        }

        // 4
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e2) {
            exceptions.add(e2);
        }
        // 5
        try {
            Object x = new Integer(10);
            String s2 = (String)x;
        }catch (ClassCastException j){
            exceptions.add(j);
        }
        // 6
        try {
            int[] array = new int[5];
            array = null;
            int i = array[2];
        }catch (NullPointerException f){
            exceptions.add(f);
        }
        // 7
        try {
            String s1 = "FOOBAR";
            int i = Integer.parseInt(s1);
        }catch (NumberFormatException q){
            exceptions.add(q);
        }
        // 8
        try {
            Object[] str = new String[10];
            str[0] = new Character('%');
        }catch(ArrayStoreException b) {
            exceptions.add(b);
        }
        // 9
        try {
            throw new IllegalStateException("MyException");

        } catch (IllegalStateException m) {
            exceptions.add(m);
        }
        // 10
        try {
            String str = "easysteps2buildwebsite";
            System.out.println(str.length());
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e9) {
            exceptions.add(e9);
        }

    }
}

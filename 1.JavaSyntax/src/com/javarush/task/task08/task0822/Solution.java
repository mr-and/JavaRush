package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        List<Integer> integerList = getIntegerList();
//        System.out.println(getMinimum(integerList));
//    }
//
//    public static int getMinimum(List<Integer> array) {
//        // Найти минимум тут
//        return 0;
//    }
//
//    public static List<Integer> getIntegerList() throws IOException {
//        // Создать и заполнить список тут
//        return null;
//    }
//}
































public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int min = Integer.parseInt(String.valueOf(Collections.min(array)));

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i=0; i<N;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        //create and initialize a list here - создать и заполнить список тут
        return list;
    }
}

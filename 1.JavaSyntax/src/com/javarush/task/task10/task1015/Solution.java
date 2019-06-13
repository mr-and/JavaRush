package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList<String>[] allList =  new ArrayList[2];

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java1");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java2");


        allList[0] = list1;
        allList[1] = list2;

        return allList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
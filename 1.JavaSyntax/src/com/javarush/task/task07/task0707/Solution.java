package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> ten_stroke = new ArrayList<>();

        ten_stroke.add(0, "a");
        ten_stroke.add(0, "b");
        ten_stroke.add(0, "c");
        ten_stroke.add(0, "d");
        ten_stroke.add(0, "e");


        System.out.println(ten_stroke.size());


    }
}

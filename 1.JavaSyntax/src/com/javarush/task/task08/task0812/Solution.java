package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        //напишите тут ваш код
//
//    }
//}






































public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10;i++) list.add(Integer.parseInt(reader.readLine()));
        int max = 1;
        int c = 1;
        for(int i = 1;i < list.size();i++){
            if(list.get(i).equals(list.get(i - 1))) c++;
            if(!(list.get(i).equals(list.get(i - 1))) && c!=1|| i == list.size()-1){
                if(c > max) max = c;
                c = 1;
            }
        }
        System.out.print(max);
    }
}
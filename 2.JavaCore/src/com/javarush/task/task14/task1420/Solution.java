package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());


        if ((one <= 0) || (two <= 0)) {
            throw new Exception();
        }

        else {
            System.out.println(GCD.gcd(one, two));
        }

    }

    public static class GCD {
        public static int gcd(int a, int b) {
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;
        }
    }
}

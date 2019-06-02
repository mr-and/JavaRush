package com.javarush.task.task14.task1421;

public  class Singleton {

    private Singleton() {
    }

    private static Singleton instance;


    public static Singleton  getInstance(int a, int b) {

        int x = a*b;

        return instance;
    }
}

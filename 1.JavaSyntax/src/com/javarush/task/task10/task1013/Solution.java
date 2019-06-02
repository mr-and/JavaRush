package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int heigth;
        private int age;
        private int weight;
        private char sex;
        private boolean haveAPet;


        public Human(boolean haveAPet) {
            this.haveAPet = haveAPet;
        }

        public Human(char sex) {
            this.sex = sex;
        }

        public Human(int heigth) {
            this.heigth = heigth;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age, int weight, char sex) {
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(char sex, boolean haveAPet) {
            this.sex = sex;
            this.haveAPet = haveAPet;
        }

        public Human(String name, int heigth, int age) {
            this.name = name;
            this.heigth = heigth;
            this.age = age;
        }

        public Human(int age, int weight, char sex, boolean haveAPet) {
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.haveAPet = haveAPet;
        }

        public Human(String name, int heigth, int age, int weight, char sex) {
            this.name = name;
            this.heigth = heigth;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(int heigth, int age, int weight, char sex) {
            this.heigth = heigth;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }
    }


}

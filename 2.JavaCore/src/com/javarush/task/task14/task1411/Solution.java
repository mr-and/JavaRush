package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        while (true){
            String input = reader.readLine();
            if(input.equals("user")){
                doWork(new Person.User());
            }
            else if(input.equals("loser")){
                doWork(new Person.Loser());
            }
            else if (input.equals("coder")){
                doWork(new Person.Coder());
            }
            else if (input.equals("proger")){
                doWork(new Person.Proger());
            }
            else {
                break;
            }
        }
        //тут цикл по чтению ключей, пункт 1
        {


        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        else if( person instanceof  Person.Coder){
            ((Person.Coder) person).writeCode();
        }
        else if( person instanceof  Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        else if(person instanceof  Person.Proger){
            ((Person.Proger) person).enjoy();
        }
        // пункт 3
    }
}

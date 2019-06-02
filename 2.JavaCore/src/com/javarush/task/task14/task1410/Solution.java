package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(new  Wine().getHolidayName());
        System.out.println( new BubblyWine().getHolidayName());

    }

    public static Drink getDeliciousDrink() {

        return new BubblyWine();
    }

    public static Wine getWine() {

        return new  Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}

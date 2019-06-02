//package com.javarush.task.task08.task0827;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///*
//Работа с датой
//*/
//
////public class Solution {
////    public static void main(String[] args) {
////        System.out.println(isDateOdd("MAY 1 2013"));
////    }
////
////    public static boolean isDateOdd(String date) {
////        return true;
////    }
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//public class Solution
//{
//    public static void main(String[] args)
//    {
//
//        //System.out.println(isDateOdd("MAY 1 2016"));
//        /*System.out.println(isDateOdd("JANUARY 1 2016"));
//        System.out.println(isDateOdd("JANUARY 2 2016"));
//        System.out.println(isDateOdd("JANUARY 3 2016"));
//        System.out.println(isDateOdd("JANUARY 4 2016"));
//        System.out.println(isDateOdd("JANUARY 5 2016"));*/
//    }
//
//    public static boolean isDateOdd(String date)
//    {
//        Date startDate = new Date();
//        startDate.setDate(1);
//        startDate.setMonth(0);
//
//        DateFormat format = new SimpleDateFormat("MMMM d yyyy");
//        Date currectDate = null;
//
//        try
//        {
////            currectDate = format.parse(date);
////        }
////        catch (ParseException e)
////        {
////            e.printStackTrace();
////        }
//
//        int day = 1;
//        day += (int) ((currectDate.getTime() - (startDate.getTime()-24*60*60*1000))/24/60/60/1000);
//        //System.out.println(day);
//
//        if (day % 2 == 0)
//            return false;
//        return true;
//    }
//}
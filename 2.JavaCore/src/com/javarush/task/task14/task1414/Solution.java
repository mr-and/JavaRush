package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String key = reader.readLine();
            if (!(key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera"))) {
                MovieFactory.getMovie(key);
                break;}

            else
                MovieFactory.getMovie(key);


        }

    }

static class MovieFactory {

    static Movie getMovie(String key) {
        Movie movie = null;

        //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
        if ("soapOpera".equals(key)) {
            movie = new SoapOpera();
            System.out.println(movie.getClass().getSimpleName());
        }

        if ("cartoon".equals(key)) {
            movie = new Cartoon();
            System.out.println(movie.getClass().getSimpleName());
        }

        if ("thriller".equals(key)) {
            movie = new Thriller();
            System.out.println(movie.getClass().getSimpleName());
        }

        return movie;
    }
}

static abstract class Movie {
}

static class SoapOpera extends Movie {
}

static class Cartoon extends Movie {

}

static class Thriller extends Movie {

}
}

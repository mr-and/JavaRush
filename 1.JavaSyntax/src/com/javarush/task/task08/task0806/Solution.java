package com.javarush.task.task08.task0806;


import javax.script.ScriptEngineManager;

import java.io.PrintStream;

public class Solution {

    /**
     * Самый простой, но менее точный результат. Что с безопасностью?
     * @param expression выражение для расчета
     */
    private static void calc(String expression) {
        try {
            System.out.println(new ScriptEngineManager().getEngineByName("JavaScript").eval(expression));
        } catch (Exception ex) {
            try (PrintStream stream = (System.out.append("Nan"))) {}
        }
    }

    public static void main(String[] args) {
        calc("+5 + -12");
        calc("+5 * -12");
        calc("+5 - -12");
        calc("+5 / -12");
    }
}
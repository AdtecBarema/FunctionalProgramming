package com.addisu.functionalprogramming.functionalInterface;

import java.util.function.Function;

public class _Function {


    public static void main (String[] args) {
        System.out.println ("Test class");

        int fromFunctionalInterface = incrementByOne.apply (2);
        System.out.println (fromFunctionalInterface);

        int fromLegacyFunc = incrementByOneLegacy (2);
        System.out.println (fromLegacyFunc);

        Integer x = incrementByOne.andThen (multiplyBy10).apply (10);
        System.out.println (x);


    }


    static Function <Integer, Integer> incrementByOne = number -> number + 1;
    static Function <Integer, Integer> multiplyBy10 = num -> num * 10;
    static int incrementByOneLegacy (int num) {
        return num + 1;
    }
}
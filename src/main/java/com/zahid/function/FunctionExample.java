package com.zahid.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        System.out.println("# String Length");
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("lambda"));
        System.out.println(strLength.apply("lambda expression"));
        System.out.println(strLength.apply("functional interface"));
        System.out.println();

        System.out.println("# Square Number");
        Function<Integer, Integer> squareIt = n -> n * n;
        System.out.println(squareIt.apply(4));
        System.out.println(squareIt.apply(9));
        System.out.println(squareIt.apply(12));
        System.out.println();

        System.out.println("# Chaining `strLength` & `squareIt`");
        System.out.println(strLength.andThen(squareIt).apply("lambda"));
        System.out.println(strLength.andThen(squareIt).apply("Once upon a time in the wild west."));
        System.out.println();
    }
}

package com.zahid.function;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        System.out.println("# Binary Multiplication");
        BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
        System.out.println(multiplication.apply(4, 9));
        System.out.println();

        System.out.println("# Binary Average");
        BiFunction<Double, Double, Double> average = (x, y) -> (x + y) / 2;
        System.out.println(average.apply(4.9, 2.3));
        System.out.println();
    }   
}

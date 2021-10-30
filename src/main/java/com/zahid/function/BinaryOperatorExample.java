package com.zahid.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        
        System.out.println("# Binary Addition");
        BinaryOperator<Integer> binaryAddition = (x, y) -> x + y;
        System.out.println(binaryAddition.apply(4, 9));
        System.out.println();
        
        System.out.println("# Binary Addition");
        BinaryOperator<Integer> binaryMultiplication = (x, y) -> x * y;
        System.out.println(binaryMultiplication.apply(12, 16));
        System.out.println();
    }
}

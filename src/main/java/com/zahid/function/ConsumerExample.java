package com.zahid.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        System.out.println("# Consumer: Print");
        Consumer<String> printText = str -> System.out.println(str);
        printText.accept("Once upon a time in America");
        System.out.println();

        System.out.println("# List manipulation");
        List<Integer> numbers = Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6, 0);
        Consumer<Integer> printNum = n -> System.out.printf(n + " ");
        numbers.forEach(printNum);
        System.out.println();

    }
}

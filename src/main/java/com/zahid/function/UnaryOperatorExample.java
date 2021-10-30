package com.zahid.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        
        System.out.println("# Unary Increment");
        UnaryOperator<Integer> incrementIt = x -> ++x ;
        System.out.println(incrementIt.apply(4));
        System.out.println();

        System.out.println("# Unary Square");
        UnaryOperator<Integer> squaretIt = x -> x*x ;
        System.out.println(squaretIt.apply(4));
        System.out.println();

        System.out.println("# Unary Cube");
        UnaryOperator<Integer> cubetIt = x -> x*x*x ;
        System.out.println(cubetIt.apply(4));
        System.out.println();
        
        System.out.println("# Chaining Unary Operation");
        int multipleOperation = incrementIt.andThen(squaretIt).andThen(cubetIt).apply(2);
        System.out.println(multipleOperation);
        System.out.println();

        System.out.println("# Applying unary operator to integer array");
        List<Integer> numbers = Arrays.asList(4, 9, 2, 3, 5);
        System.out.println(numbers.stream().map(incrementIt).collect(Collectors.toList()));
        System.out.println(numbers.stream().map(squaretIt).collect(Collectors.toList()));
        System.out.println(numbers.stream().map(cubetIt).collect(Collectors.toList()));
        System.out.println();

        System.out.println("# Unary `toUpperCase`");
        UnaryOperator<String> upperCaseConverter = str -> str.toUpperCase();
        System.out.println(upperCaseConverter.apply("lambda expression"));
        System.out.println();

        System.out.println("# Unary `toLowerCase`");
        UnaryOperator<String> lowerCaseConverter = str -> str.toLowerCase();
        System.out.println(lowerCaseConverter.apply("GOD! What Have I Done! Dammn It!"));
        System.out.println();

        System.out.println("# Applying unary operator to string array");
        // List<String> languages = Arrays.asList("Java", "Scala", "Ruby", "Python");
        List<String> languages = Arrays.asList("Java", "Kotlin", "Rust", "Scala", "Ruby", "Python");
        System.out.println(languages);
        System.out.println(languages.stream().map(upperCaseConverter).collect(Collectors.toList()));

    }
}

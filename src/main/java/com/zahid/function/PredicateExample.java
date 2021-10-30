package com.zahid.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println("# Predicate: isEven");
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(9));
        System.out.println();

        System.out.println("# Predicate: isPrime");
        Predicate<Integer> isPrime = (num) -> {
            if(num == 0 || num == 1) return false;

            int limit = (int) Math.sqrt(num);
            for(int i=2; i<= limit; i++) {
                if(num % i == 0) return false;
            }
            return true;
        };
        System.out.println(isPrime.test(4));
        System.out.println(isPrime.test(5));
        System.out.println(isPrime.test(7));
        System.out.println();

        System.out.println("# Filtering list using predicate");
        // List<Integer> numbers = Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6, 0);
        List<Integer> numbers = Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6, 0, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println(numbers);
        System.out.println(numbers.stream().filter(isEven).collect(Collectors.toList()));
        System.out.println(numbers.stream().filter(isPrime).collect(Collectors.toList()));
        System.out.println();

        System.out.println("# Predicate with and");
        System.out.println(numbers.stream().filter(x -> x > 5 && x < 12).collect(Collectors.toList()));
        System.out.println();

        System.out.println("# Predicate with negate");
        Predicate<Integer> lessThanTen = x -> x < 10;
        System.out.println(numbers.stream().filter(lessThanTen.negate()).collect(Collectors.toList()));
        System.out.println();


    }
}

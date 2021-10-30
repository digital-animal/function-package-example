package com.zahid.function;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        
        System.out.println("# BiPredicate: isLengthEqual");
        BiPredicate<String, String> isLengthEqual = (s1, s2) -> s1.length() == s2.length();
        System.out.println(isLengthEqual.test("Alex", "Lee"));
        System.out.println(isLengthEqual.test("Lee", "Cooper"));
        System.out.println();
        
        System.out.println("# BiPredicate: areTheyEqual");
        BiPredicate<Integer, Integer> areTheyEqual = (n1, n2) -> n1 == n2;
        System.out.println(areTheyEqual.test(4, 4));
        System.out.println(areTheyEqual.test(4, 9));
        System.out.println();
    }
}

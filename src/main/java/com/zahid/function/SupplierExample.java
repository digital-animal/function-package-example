package com.zahid.function;

import java.math.BigDecimal;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println("# Supplier: String");
        Supplier<String> lang = () -> "Java";
        System.out.println(lang.get());
        System.out.println();

        System.out.println("# Supplier: String Length");
        Supplier<Integer> strLength = () -> "Java".length();
        System.out.println(strLength.get());
        System.out.println();

        System.out.println("# Supplier: BigDecimal PI");
        Supplier<BigDecimal> PI = () -> new BigDecimal(3.1415926535897932384626433832795028841971);
        System.out.println(PI.get());
        System.out.println();
    }
}

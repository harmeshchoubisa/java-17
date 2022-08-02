package com.learn.functionalinterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SampleBuiltInFunctionalInterface {

    public static void main(String[] args) {


        // A supplier is used when we want to generate or supply value without taking any input

        // method reference
        Supplier<LocalDate> s1 = LocalDate::now;
        // lambda way
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}

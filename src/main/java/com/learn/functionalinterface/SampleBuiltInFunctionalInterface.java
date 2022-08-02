package com.learn.functionalinterface;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
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

        // A consumer is used when we want to do something with parameter but not return anything

        // method reference
        Consumer<String> c1 = System.out::println;
        // lambda way
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("First name");
        c2.accept("Last name");

        // Bi-consumer does the same thing except it takes two parameters
        var map = new HashMap<String, Integer>();
        // method reference
        BiConsumer<String, Integer> b1 = map::put;
        // lambda way
        BiConsumer<String, Integer> b2 = (k,v) -> map.put(k, v);
        b1.accept("Chicken", 7);
        b2.accept("Chick", 1);
        System.out.println(map);
    }
}

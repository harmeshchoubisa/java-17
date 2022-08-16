package com.learn.functionalinterface;

import java.util.function.Predicate;

public class SampleConvenienceMethod {

    public static void main(String[] args) {


        // filter brown eggs and other eggs
        filterEggs();
    }

    private static void filterEggs() {

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        // This works, but it contains duplication
        // What if we decide letter e should be capitalized in egg
        Predicate<String> brownEggs = s-> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        // Using default functional interfaces
        Predicate<String> brownEggs1 = egg.and(brown);
        Predicate<String> otherEggs1 = egg.and(brown.negate());
    }
}

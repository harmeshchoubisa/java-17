package com.learn.streams;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleGroupBy {

    // Fetch first letter of alphabetically sorted animals names from each group of animals with same length
    public static void main(String[] args) {

        var animals = Stream.of("tigers", "lions", "bears");
       Map<Integer, Optional<Character>> finalMap = animals.collect(
               Collectors.groupingBy(
                       String::length,
                       // to count
                       // Collectors.counting()
                       // to map
                       Collectors.mapping(
                               s -> s.charAt(0),
                               Collectors.minBy((a,b) -> a-b)
                       )
               )
       );
        System.out.println(finalMap);

    }
}

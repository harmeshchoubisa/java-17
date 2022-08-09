package com.learn.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SampleStream {

    public static void main(String[] args) {

        var list = Stream.of("monkey", "elephant", "lion");
        var infiniteStream = Stream.generate(() -> "chimp");

        System.out.println(list.findAny());
        infiniteStream.findAny().ifPresent(System.out::println);

        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));

        var list1 = List.of("monkey", "elephant", "lion", "2");
        var infiniteStream1 = Stream.generate(() -> "chimp");
        System.out.println(list1.stream().anyMatch(predicate));
        System.out.println(list1.stream().allMatch(predicate));
        System.out.println(list1.stream().noneMatch(predicate));
        // returns true as the condition is met
        System.out.println(infiniteStream1.anyMatch(predicate));
        // program will run infinite time unless we kill it
        System.out.println(infiniteStream1.allMatch(predicate));
    }
}

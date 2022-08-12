package com.learn.streams.reviewquestions;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Question2 {

    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.startsWith("g");
        var stream1 = Stream.generate(() -> "growl()!");
        var stream2 = Stream.generate(() -> "growl()!");
        // prints true
        //System.out.println(stream1.anyMatch(predicate));
        // code hangs
        // System.out.println(stream2.allMatch(predicate));
        // code hangs
        System.out.println(stream1.anyMatch(predicate) + "" + stream2.allMatch(predicate));
    }
}

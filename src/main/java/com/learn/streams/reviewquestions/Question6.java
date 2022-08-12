package com.learn.streams.reviewquestions;

import java.util.stream.Stream;

public class Question6 {

    public static void main(String[] args) {

        // infinite stream
        var stream = Stream.generate(() -> "meow");
        var b1 = stream.allMatch(String::isEmpty);
        System.out.println(b1);
    }
}

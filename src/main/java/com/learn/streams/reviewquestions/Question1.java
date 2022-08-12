package com.learn.streams.reviewquestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {

    public static void main(String[] args) {

        // infinite stream
        var stream = Stream.iterate("", (s) -> s + "1");
        // this will print reference pipeline as there are no terminal operations are called
        System.out.print(stream.limit(2).map(x -> x + "2"));
        // this can be used to print the elements of the stream
         System.out.print(stream.limit(2).map(x -> x + "2").collect(Collectors.toList()));

    }
}

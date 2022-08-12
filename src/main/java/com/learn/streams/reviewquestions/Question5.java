package com.learn.streams.reviewquestions;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Question5 {

    public static void main(String[] args) {

        double result = LongStream.of(6l, 8l, 10l).
                mapToInt(x -> (int)x).
                boxed().
                collect(Collectors.groupingBy(x -> x, Collectors.toSet())).
                keySet().
                stream().
                collect(Collectors.averagingInt(x -> x));
        System.out.println(result);
    }
}

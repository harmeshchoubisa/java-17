package com.learn.streams;

import java.util.stream.IntStream;

public class SampleIntStream {

    public static void main(String[] args) {

        var numbers = IntStream.of(1,2,3,4,5,6);
        System.out.println(numbers.average().getAsDouble());

    }
}

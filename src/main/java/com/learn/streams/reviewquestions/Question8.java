package com.learn.streams.reviewquestions;

import java.util.stream.IntStream;

public class Question8 {

    public static void main(String[] args) {

        var is = IntStream.empty();
        System.out.println(is.sum());
        var is1 = IntStream.of(1,2,3);
        System.out.println(is1.sum());
    }
}

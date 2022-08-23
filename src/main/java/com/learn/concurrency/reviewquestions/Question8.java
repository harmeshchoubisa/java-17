package com.learn.concurrency.reviewquestions;

import java.util.stream.LongStream;

public class Question8 {
    private static int counter;

    public static void main(String[] args) {
        countIceCreamFlavours();
    }

    public static void countIceCreamFlavours() {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(0, 500).
                forEach(m -> new Thread(task).run());
        System.out.println(counter);
    }
}

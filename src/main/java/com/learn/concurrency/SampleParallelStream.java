package com.learn.concurrency;

import java.util.List;

public class SampleParallelStream {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        //sequentialStream();
        parallelStream();

        System.out.println("Time taken :" + (System.currentTimeMillis() - start) / 1000);

    }

    private static void sequentialStream() {
        List.of(1, 2, 3, 4, 5).
                stream().
                map(w -> doWork(w)).
                forEach(System.out::print);
    }

    private static void parallelStream() {
        List.of(1, 2, 3, 4, 5).
                parallelStream().
                map(w -> doWork(w)).
                forEach(System.out::print);
    }

    public static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        return input;
    }
}

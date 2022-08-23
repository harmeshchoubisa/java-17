package com.learn.concurrency;

import java.util.List;
import java.util.stream.Stream;

public class SampleParallelStream {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        sequentialStream();
        // parallelStream();

        System.out.println("Time taken: " + (System.currentTimeMillis() - start) / 1000);

    }

    private static void sequentialStream() {
        Stream.of(1, 2, 3, 4, 5).
                map(SampleParallelStream::doWork).
                forEach(s -> System.out.print(s + " "));
    }

    private static void parallelStream() {
        List.of(1, 2, 3, 4, 5).
                parallelStream().
                map(SampleParallelStream::doWork).
                forEach(s -> System.out.print(s + " "));
    }

    public static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        return input;
    }
}

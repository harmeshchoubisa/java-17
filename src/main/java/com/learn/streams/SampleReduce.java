package com.learn.streams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Reduce combines stream into a single object
 * Three available method signatures as per below
 */
public class SampleReduce {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        // public T reduce(T identity, BinaryOperator<T> accumulator)
        // System.out.println(stream.reduce("", String::concat));
        System.out.println(stream.reduce("", (a,b) -> a+b));

        // public Optional<T> reduce(BinaryOperator<T> accumulator)
        BinaryOperator<Integer> operator = (a,b) -> a*b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElement = Stream.of(3,4,5);

        empty.reduce(operator).ifPresent(System.out::println);  // no output
        oneElement.reduce(operator).ifPresent(System.out::println); // 3
        threeElement.reduce(operator).ifPresent(System.out::println); // 60

        // public <U> U reduce(U identity, BiFunctional<U, ? super(T,U)> accumulator, BinaryOperator<U> combiner)
        Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
        // int length = stream3.reduce(0, (i,s) -> i+s.length(), (a,b) -> a+b);
        int length = stream3.reduce(0, (i,s) -> i+s.length(), Integer::sum);
        System.out.println(length); //5
    }
}

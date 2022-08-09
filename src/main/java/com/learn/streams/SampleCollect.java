package com.learn.streams;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The collect method is also called as mutable reduction and is more efficient than regular reduction as it
 * uses same mutable object while accumulates
 * It has 2 method signatures
 *
 * 1. public <R> R collect(Supplier<R> supplier,
 *                       BiConsumer<R, ? super T> accumulator,
 *                       BiConsumer<R,R> combiner)
 *
 * 2. public <R,A> R collect(Collector<? super T, A,R> collector)
 */
public class SampleCollect {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(word);

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        TreeSet set = stream1.collect(TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(set);

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet set1 = stream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1);

        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        Set set2 = stream3.collect(Collectors.toSet());
        System.out.println(set2);

    }
}

package com.learn.streams.reviewquestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question13 {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of();

// won't compile as we cannot add (+) in a list
//        Stream.of(list1, list2, list3).
//                map(x -> x+1).
//                flatMap(x -> x.stream()).
//                forEach(System.out::println);

        Stream.of(list1, list2, list3).
                flatMap(x -> x.stream()).
                map(x -> x + 1).
                forEach(System.out::print);


    }
}

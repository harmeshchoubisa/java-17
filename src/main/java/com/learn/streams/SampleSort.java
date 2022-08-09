package com.learn.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This class sorts first two names of your friends alphabetically that has exact 4 letters in the names
 */
public class SampleSort {


    public static void main(String[] args) {

        var friends = List.of("Rakesh", "Anil", "Tom", "Sushil", "Jack");
        System.out.println(friends.stream().filter(friend -> friend.length() == 4)
                .sorted()
                .limit(2)
                .collect(Collectors.toList()));

    }
}

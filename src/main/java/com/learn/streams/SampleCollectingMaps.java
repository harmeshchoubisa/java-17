package com.learn.streams;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleCollectingMaps {

    public static void main(String[] args) {

        var animals = Stream.of("lions", "tigers", "moles", "bears");
        Map<Integer, String> collectingMap = animals.collect(Collectors.toMap(
                String::length,
                k -> k, (s1, s2) -> s1 + "," + s2,
                TreeMap::new)
        );
        System.out.println(collectingMap);
    }
}

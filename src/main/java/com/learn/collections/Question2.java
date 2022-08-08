package com.learn.collections;

import java.util.List;

public class Question2 {

    public static void main(String[] args) {

        List<?> q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");


        testTypes(q, v);


    }

    private static void testTypes(List<?> q, List<String> v) {
        // not compile as non-static method cannot be called from a static method
        // q.removeIf(String::isEmpty);
        // not compile as q is not specifying the type as String
        // q.removeIf(s -> s.length() == 4);

        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);

    }
}

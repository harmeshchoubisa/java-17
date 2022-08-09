package com.learn.streams;

import java.util.ArrayList;

public class SampleLazyEvaluation {

    public static void main(String[] args) {

        var animals = new ArrayList<String>();
        animals.add("lion");
        animals.add("elephant");
        // stream won't be created here as lambdas are lazy evaluated
        var stream = animals.stream();
        animals.add("zebra");
        System.out.println(stream.count());
    }
}

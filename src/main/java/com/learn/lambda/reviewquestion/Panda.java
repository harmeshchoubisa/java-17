package com.learn.lambda.reviewquestion;

import java.util.function.Predicate;

public class Panda {

    int age;

    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.age = 1;
        check(panda, p -> p.age < 5);
    }

    public static void check(Panda panda, Predicate<Panda> predicate) {
        String result = predicate.test(panda) ? "match" : "not match";
        System.out.println(result);
    }
}

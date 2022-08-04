package com.learn.lambda.reviewquestion;

import java.util.function.Predicate;

public class Fantasy {

    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");
    }

    private static void scary(String animal) {
        Predicate<String> dino = s -> s.equals(animal);
        Predicate<String> dragon = s -> s.equals(animal);
        var combined = dino.or(dragon);
        System.out.println(combined.test(animal));
    }
}

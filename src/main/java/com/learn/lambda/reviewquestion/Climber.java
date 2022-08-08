package com.learn.lambda.reviewquestion;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Climber {

    public static void main(String[] args) {
        // won't compile as append is not any valid function on int
        //check((h, m) -> h.append(m).isEmpty(), 5);
        // The code compiles and x in each lambda refers to a different type
        x((var x) -> {},(var x, var y) -> false);
        // tricky question to check scope of variables in context of lambda
        remove(List.of('p','q','r','s','t'));

    }

    public static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)) {
            System.out.println("too high");
        } else {
            System.out.println("ok");
        }

    }

    public static void x(Consumer<String> x, BinaryOperator<Boolean> y) {

    }

    public static void remove(List<Character> chars) {

        char end = 'z';
        Predicate<Character> pred = c -> {
            char start = 'a';
            return start <= c && c <= end;
        };
        // can compile as all below variables are outside the scope of lambda and declared below
        char start = 'm';
        char c = 'c';
        chars = null;
        // this won't compile as this variable is used in lambda and should be effectively final
        // end = '1';

    }
}

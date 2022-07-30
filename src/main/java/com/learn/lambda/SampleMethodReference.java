package com.learn.lambda;

/**
 * Method reference is similar like lambda that deferred execution and is generally represented by syntax ::
 *
 * Four formats for method references
 * 1. static methods
 * 2. instance methods on a particular objects
 * 3. instance methods on a parameter to be determined at runtime
 * 4. constructors
 */
public class SampleMethodReference {

    public static void main(String[] args) {

        // method reference with static method format
        Converter methodRefConverter = Math::round;
        System.out.println(methodRefConverter.round(100.50));
        Converter converterLambda = number -> Math.round(100.50);
        System.out.println(converterLambda.round(100.50));

    }

}

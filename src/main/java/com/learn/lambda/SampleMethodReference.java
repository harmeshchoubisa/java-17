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
        Converter lambdaConverter = number -> Math.round(100.50);
        System.out.println(lambdaConverter.round(100.50));

        // method reference with calling instance on a particular object
        var str = "Zoo";
        StringStarter methodRefStringStarter = str::startsWith;
        System.out.println(methodRefStringStarter.beginningCheck("A"));
        StringStarter lambdaStringStarter = s -> str.startsWith(s);
        System.out.println(lambdaStringStarter.beginningCheck("A"));

        // method reference with calling instance on a parameter
        StringTwoParameterChecker methodRefStringTwoParameterChecker = String::startsWith;
        StringTwoParameterChecker lambdaStringTwoParameterChecker = (s, p) -> s.startsWith(p);
        System.out.println(methodRefStringTwoParameterChecker.check("Zoo", "A"));

        // method reference with calling constructor
        StringCopier methodRefStringCopier = String::new;
        StringCopier lambdaStringCopier = x -> new String(x);
        var myString = methodRefStringCopier.copy("Zebra");
        System.out.println(myString.equals("Zebra"));
        

    }

}

package com.learn.lambda;

/**
 * A functional interface is an interface that contains a single abstract method
 * also known as SAM (single abstract method)
 */
@FunctionalInterface
public interface SampleFunctionalInterface {

    // It is not the annotation that makes it functional interface, however it is SAM
    public void sprint(int speed);
}


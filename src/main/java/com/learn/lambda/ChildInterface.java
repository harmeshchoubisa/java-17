package com.learn.lambda;

/**
 * This is an interface but not eligible for functional interface
 * as there is an additional method skip() and this violates SAM principle
 */
public interface ChildInterface extends SampleFunctionalInterface{
     void skip();
}


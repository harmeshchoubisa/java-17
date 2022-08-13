package com.learn.exceptions;

public class SampleSuppressedException implements AutoCloseable{


    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Door is not closed");
    }

    public static void main(String[] args) {

        try (SampleSuppressedException t = new SampleSuppressedException()){
            throw new IllegalStateException("children ran away");
        }
        catch (IllegalStateException exception) {
            System.out.println("Caught: " +exception.getMessage());
            for(Throwable t : exception.getSuppressed()) {
                System.out.println("Suppressed: " +t.getMessage());
            }
        }
    }
}

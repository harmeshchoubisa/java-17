package com.learn.collections.reviewqiestions;

import java.io.FileNotFoundException;

public class ExceptionHelper {

    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        ExceptionHelper.printException(new FileNotFoundException("A"));
        ExceptionHelper.printException(new Exception("B"));
        ExceptionHelper.<NullPointerException>printException(new NullPointerException("D"));
    }
}

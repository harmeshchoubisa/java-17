package com.learn.exceptions.reviewquestions;

import java.io.IOException;

public class Question1 {

    public void whatHappensNext() throws IOException {
        System.out.print("its_ok");
       // throw new IllegalArgumentException();
        throw new IOException();
       // throw new RuntimeException();

    }
}

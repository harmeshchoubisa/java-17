package com.learn.lambda.reviewquestion;

import java.util.function.Supplier;

public class Question13 {

    public static void main(String[] args) {
        int length = 3;

        for(int i =0; i<3; i++) {
           if(i%2 == 0) {
               Supplier<Integer> supplier = () -> length;
               System.out.println(supplier.get());
           }
           else {
               int j = i;
               Supplier<Integer> supplier = () -> j;
               System.out.println(supplier.get());
           }
        }
    }
}

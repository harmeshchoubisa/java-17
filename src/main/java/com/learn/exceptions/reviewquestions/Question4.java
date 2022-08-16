package com.learn.exceptions.reviewquestions;

public class Question4 {

    public static void main(String[] args) {

        try {
            System.out.println(0/0);
        } catch (ArithmeticException e) {
            System.out.println(0);
        }
        catch (RuntimeException e) {
            System.out.println(-1);
        }  finally {
            System.out.println("done");
        }
    }
}

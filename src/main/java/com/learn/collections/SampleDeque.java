package com.learn.collections;

import java.util.ArrayDeque;

public class SampleDeque {

    public static void main(String[] args) {

        var greetings = new ArrayDeque<String>();

        // adds an element in last so, similar like addLast
        greetings.offerLast("hello");
        greetings.offerLast("hi");
        // adds an element at first
        greetings.offerFirst("ola");
        // removes first element of the deque
        greetings.pop();
        // read first element of the deque
        greetings.peek();

        while (greetings.peek() != null) {
            System.out.print(greetings.pop()); //hellohi
        }
    }
}

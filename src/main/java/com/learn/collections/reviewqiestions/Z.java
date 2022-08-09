package com.learn.collections.reviewqiestions;

public class Z<Y> {

    public static void main(String[] args) {

        W w1 =  new W();
        W w2 =  new X();
        // compilation error

//        W w3 = new Y();
//        Y y1 = new W();
//        Y y2 = new X();
//        Y y1 = new Y();

    }

}

class W { }

class X extends W {}
class Y extends X {}

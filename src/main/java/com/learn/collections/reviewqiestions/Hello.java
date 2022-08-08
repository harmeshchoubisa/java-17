package com.learn.collections.reviewqiestions;

public record Hello<T>(T t) {

    private <T> void println(T message) {
        System.out.print(t + "-" + message);
    }

    public static void main(String[] args) {
        new Hello<String>("hi").println(1);
        new Hello("hola").println(true);
    }
}

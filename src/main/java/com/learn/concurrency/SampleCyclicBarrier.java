package com.learn.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class SampleCyclicBarrier {

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(4);
        try {
            var manager = new SampleCyclicBarrier();
            var cyclicBarrier1 = new CyclicBarrier(4);
            var cyclicBarrier2 = new CyclicBarrier(4, () -> System.out.println("****Pen cleaned!"));
            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(cyclicBarrier1, cyclicBarrier2));
            }
        } finally {
            service.shutdown();
        }

    }

    private static void removeLions() {
        System.out.println("Removing lions");
    }

    private static void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private static void addLions() {
        System.out.println("Adding lions");
    }

    public void performTask(CyclicBarrier cyclicBarrier1, CyclicBarrier cyclicBarrier2) {
        try {
            removeLions();
            cyclicBarrier1.await();
            cleanPen();
            cyclicBarrier2.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}

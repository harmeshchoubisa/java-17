package com.learn.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SampleReentrantLock {

    public static void main(String[] args) throws Exception {

        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();
        if (lock.tryLock(1, TimeUnit.NANOSECONDS)) {
            try {
                // It is critical to release a lock the same number of times it is acquired
                // lock.lock();
                System.out.println("Acquired lock in 10 seconds, entering protected code");
            } finally {
                // lock.unlock();
                lock.unlock();
            }

        } else {
            System.out.println("Unable to acquire lock ");
        }

    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }

    }
}

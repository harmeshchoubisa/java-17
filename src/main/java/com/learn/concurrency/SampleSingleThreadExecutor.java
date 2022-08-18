package com.learn.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleSingleThreadExecutor {


    public static void main(String[] args) {

        Runnable printInventory = () -> System.out.println("print inventory");
        Runnable printRecords = () -> {
            for(int i =0; i< 3; i++)
                System.out.println("Printing record " + i);
        };

       // With a single thread executor task are guaranteed to execute sequentially!
        // Still we can see "end" is printed before because that is from main thread which is not a part of executor service
        final ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        service.execute(printInventory);
        service.execute(printRecords);
        service.execute(printInventory);
        System.out.println("end");

    }
}

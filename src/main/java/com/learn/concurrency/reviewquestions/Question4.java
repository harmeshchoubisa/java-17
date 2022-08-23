package com.learn.concurrency.reviewquestions;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Question4 {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        try {
            var result = service.scheduleWithFixedDelay(() -> System.out.println("Open Zoo"), 0, 5, TimeUnit.SECONDS);
            service.submit(() ->
                    System.out.println("Wake up staff"));
             System.out.println(result.get());
        } finally {
            service.shutdown();
        }


    }
}

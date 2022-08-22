package com.learn.concurrency;

import java.util.HashMap;

public class SampleConcurrentCollection {

    public static void main(String[] args) {

        // This will throw concurrent modification exception during the second iteration of the loop
        // since the iterator on keySet() is not properly updated after the first element is removed
        // Changing HashMap to ConcurrentHashMap will solve the issue
        var foodData = new HashMap<String, Integer>();
        // var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("potatoes", 1);
        foodData.put("broccoli", 2);

        for(String key : foodData.keySet()) {
            foodData.remove(key);
        }
    }
}

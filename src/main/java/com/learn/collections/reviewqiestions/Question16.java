package com.learn.collections.reviewqiestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question16 {

    public static void main(String[] args) {

        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.containsKey("123"));
    }
}

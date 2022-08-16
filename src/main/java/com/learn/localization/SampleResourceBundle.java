package com.learn.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class SampleResourceBundle {

    public static void main(String[] args) {
        var us = new Locale("en", "US");
        var fr = new Locale("fr", "FR");
        printWelcomeMessage(us);
        printWelcomeMessage(fr);
    }

    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello") + "," + rb.getString("open"));
    }
}

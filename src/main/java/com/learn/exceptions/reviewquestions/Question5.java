package com.learn.exceptions.reviewquestions;

import java.util.Locale;

import static java.text.NumberFormat.Style.LONG;
import static java.text.NumberFormat.Style.SHORT;
import static java.text.NumberFormat.getCompactNumberInstance;
import static java.text.NumberFormat.getCurrencyInstance;

public class Question5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.Category.FORMAT,new Locale("en", "US"));
        double price = 100_102.2;
        printValues(price);
    }

    private static void printValues(double price) {
        System.out.println(getCompactNumberInstance().format(price)); // default is short
        System.out.println(getCompactNumberInstance(Locale.getDefault(), SHORT).format(price));
        System.out.println(getCompactNumberInstance(Locale.getDefault(), LONG).format(price));
        System.out.println(getCurrencyInstance().format(price));
    }
}

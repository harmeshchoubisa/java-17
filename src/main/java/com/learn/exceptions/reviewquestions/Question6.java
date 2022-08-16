package com.learn.exceptions.reviewquestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question6 {

    public static void main(String[] args) {

        var date = LocalDate.parse("2022-04-30", DateTimeFormatter.ISO_DATE_TIME); // Date Time parse exception will be thrown
        var anotherDate = LocalDate.parse("2022-04-30", DateTimeFormatter.ISO_DATE); // This is better
        System.out.println(anotherDate.getYear() + ":" + anotherDate.getMonthValue() + ":" + date.getDayOfMonth());
    }
}

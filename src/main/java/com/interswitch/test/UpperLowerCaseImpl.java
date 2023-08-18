package com.interswitch.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UpperLowerCaseImpl {
    public static void main(String[] args) {
        UpperLowerCase ulCase = new UpperLowerCase();
        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToUpperCase("Hello World"));
        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToLowerCase("Hello World"));
//        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToLowerCase(""));

        System.out.println("New Go-home Feature by " +
                "Backbone Team suggested at " + LocalDateTime.now());
    }
}

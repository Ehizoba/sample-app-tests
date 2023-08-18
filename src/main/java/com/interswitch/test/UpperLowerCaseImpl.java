package com.interswitch.test;

public class UpperLowerCaseImpl {
    public static void main(String[] args) {
        UpperLowerCase ulCase = new UpperLowerCase();
        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToUpperCase("Hello World"));
        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToLowerCase("Hello World"));
//        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToLowerCase(""));
    }
}

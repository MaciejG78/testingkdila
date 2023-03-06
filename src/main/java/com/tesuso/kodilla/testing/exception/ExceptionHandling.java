package com.tesuso.kodilla.testing.exception;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";
        try {
            result = secondChallenge.probablyIWillThrowException(3, 5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(result);
        }
    }
}

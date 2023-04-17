package com.example.stringBuilder;

public class StringVsStringBuilder {
    public static final int NUMBERS = 1_000_000;

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        testString();
        System.out.println("Slow method elapsed: " + (System.currentTimeMillis() - now) + "ms");

        now = System.currentTimeMillis();
        testStringBuilder();
        System.out.println("Fast method elapsed: " + (System.currentTimeMillis() - now) + "ms");
    }


    private static void testString() {
        String s = "";
        for (int i = 0; i< NUMBERS; i++) {
            s += "*";
        }
    }

    private static void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< NUMBERS; i++) {
            sb.append("*");
        }
    }

}

package com.example.labs.AppStreamBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        String sampleText = "Przykładowy text do upiększenia";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("\n------------------ Duże litery ----------------");
        poemBeautifier.beautify(sampleText, () -> sampleText.toUpperCase());
        System.out.println("\n------------------ Prefix i suffix \"***\" ----------------");
        poemBeautifier.beautify(sampleText, () -> "*** ".concat(sampleText).concat(" ***"));
        System.out.println("\n------------------ Małe litery ----------------");
        poemBeautifier.beautify(sampleText, () -> sampleText.toLowerCase());
        System.out.println("\n------------------ Długość napisu ----------------");
        poemBeautifier.beautify(sampleText, () -> String.valueOf(sampleText.length()));
        System.out.println("\n------------------ Ucięty napis od 0 do 11 znaków ----------------");
        poemBeautifier.beautify(sampleText, () -> sampleText.substring(0, 11));
    }
}

package com.example.labs.AppFirstJUnitTest;

/*
Zadanie: pierwszy test jednostkowy
        Zadanie polega na napisaniu prostej klasy – kalkulatora – oraz przygotowaniu testu jednostkowego dla tej klasy. Wykonanie zadania składa się z następujących kroków:

        W pakiecie com.kodilla.testing utwórz podpakiet calculator.
        W tym pakiecie stwórz i zaimplementuj nową klasę Calculator, reprezentującą prosty kalkulator z dwoma funkcjami: add(int a, int b) oraz subtract(int a, int b).
        W metodzie main klasy TestingMain napisz test sprawdzający działanie klasy Calculator (po jednym teście dla każdej metody kalkulatora).
        Rozwiązanie zadania prześlij do repozytorium GitHub.
        Link do repozytorium wklej poniżej i wyślij do Mentora.
*/

public class AppFirstJUnitTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("127 + 27 = " + calculator.add(123, 27));
        System.out.println("127 - 27 = " + calculator.subtact(127, 27));
    }
}


package com.example.labs.ApplicationBankomat;/*
Zadanie:transakcja bankowa
Aby przećwiczyć wykorzystywanie klas abstrakcyjnych w praktyce, stwórz swoje własne zachowanie dla transakcji bankowej.
Załóżmy, że transakcja bankowa zawiera się w 8 metodach, z czego 3 są zawsze po stronie banku (w klasie abstrakcyjnej).
Schemat transakcji bankowej do zaimplementowania:
        Prośba o wprowadzenie karty (Bankomat)
        Prośba o wprowadzenie kodu PIN (Bankomat)
        Prośba o wprowadzenie kwoty do wypłaty (Bankomat)
        Informacja o przyjęciu prośby wypłaty przez Bank (Bank)
        Sprawdzenie stanu konta (Bank)
        Potwierdzenie możliwości wypłaty (Bank)
        Wypłacanie gotówki (Bankomat)
        Podziękowanie za skorzystanie z usług Banku (Bankomat)
Załóż, że każde z tych działań sygnalizujemy zwykłym println. Tak jak wspominaliśmy wcześniej, na razie zajmujemy się głównie poznawaniem samego języka Java 
– praktyczne zadania przyjdą niebawem :) Posługuj się przypadkiem przedstawionym w tym submodule:
https://kodilla.com/pl/project-java/38591
Spróbuj po prostu napisać kod, który będzie imitował transakcję bankową. 
W tym zadaniu najważniejsze jest to, żeby samodzielnie spróbować podejść do definiowania metod i pisania kodu.
*/

public class ApplicationBankomat {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}

abstract class Bank {
    abstract protected void cardInputRequest();
    abstract protected void pinInputRequest();
    abstract protected void amountInputWithdrawRequest();

    private void payment() {
        System.out.println("Informacja o przyjęciu prośby wypłaty przez Bank");
    }

    private void checkAccountStatus() {
        System.out.println("Sprawdzenie stanu konta");
    }

    private void confirmationPossibilityWithdrawal() {
        System.out.println("Potwierdzenie możliwości wypłaty");
    }

    abstract protected void withdrawCash();
    abstract protected void thanksForUsingBankService();

    public void run() {
        cardInputRequest();
        pinInputRequest();
        amountInputWithdrawRequest();
        payment();
        checkAccountStatus();
        confirmationPossibilityWithdrawal();
        withdrawCash();
        thanksForUsingBankService();
    }
}

class ATM extends Bank {

    protected void cardInputRequest() {
        System.out.println("Prośba o wprowadzenie karty");
    }

    protected void pinInputRequest() {
        System.out.println("Prośba o wprowadzenie kodu PIN");
    }

    protected void amountInputWithdrawRequest() {
        System.out.println("Prośba o wprowadzenie kwoty do wypłaty");
    }

    protected void withdrawCash() {
        System.out.println("Wypłacanie gotówki");
    }

    protected void thanksForUsingBankService() {
        System.out.println("Podziękowanie za skorzystanie z usług Banku");
    }
}

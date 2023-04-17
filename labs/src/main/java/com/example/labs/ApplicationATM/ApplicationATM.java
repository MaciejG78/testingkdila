package com.example.labs.ApplicationATM;
/*Zadanie: bankomat
Stwórz interfejs obsługujący bankomat (ang. ATM) zawierający:
Dwie metody wymagające implementacji – wpłata i wypłata
Metodę domyślną – informację o połączeniu z bankiem
Metodę statyczną – informację o zakończeniu działania bankomatu
Następnie zaimplementuj taki interfejs do klasy o nazwie ATMImpl (ATM Implementation)
i stwórz ciała dla metod, które tego wymagają.
W klasie Application w metodzie main wywołaj każdą metodę.
 */

public class ApplicationATM {
    public static void main(String[] args) {
        ATMImpl atm = new ATMImpl();
        atm.connectToBank();
        atm.contribution();
        atm.payment();
        ATM.closeBankConnection();
    }
}

class ATMImpl implements ATM {

    @Override
    public void contribution() {
        System.out.println("Nastąpiła wpłata");
    }

    @Override
    public void payment() {
        System.out.println("Nastąpiła wypłata");
    }
}

interface ATM {
    void contribution();
    void payment();
    default void connectToBank() {
        System.out.println("Polaczyles się z bankiem");
    }
    static void closeBankConnection() {
        System.out.println("Rozłączono z bankiem");
    }
}
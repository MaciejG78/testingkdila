package com.example.labs.AppCannon;

/*
Napisz klasę Cannon (z ang.armata) z prywatnym polem loaded (z ang.załadowana) typu boolean oraz metodą fire()
(z ang.wystrzel), która sprawdza przed wystrzeleniem, czy kula znajduje się w armacie.
Jeśli armata nie jest załadowana, zostanie wyświetlona informacja (System.out.println) o braku kuli
w armacie, a następnie kula zostanie załadowana do tej armaty.
Część 2
W metodzie main klasy Program utwórz kolekcję typu
LinkedList do przechowywania armat.Dodaj kilka obiektów klasy Cannon do kolekcji,
a następnie – używając pętli for – załaduj wszystkie armaty.
*/

import java.util.LinkedList;
import java.util.List;

public class AppCannon {
    public static void main(String[] args) {
        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();

        LinkedList<Cannon> cannons = new LinkedList<>(List.of(cannon1, cannon2, cannon3));

        int i = 1;
        for (Cannon cannon : cannons) {
            System.out.println("\n---- Armata nr: " + i + " ----");
            cannon.fire();
            if (!cannon.isLoaded()) {
                cannon.loadCannon();
                cannon.fire();
            }
            i++;
        }

    }
}

class Cannon {

    private boolean loaded = false;

    public boolean isLoaded() {
        return loaded;
    }

    public void fire() {
        if (!loaded) {
            System.out.println("Brak kuli w armacie");
        } else {
            System.out.println("Wystrzelono kulę!!!");
        }

    }

    public void loadCannon() {
        this.loaded = true;
        System.out.println("Załadowano Armatę");
    }
}

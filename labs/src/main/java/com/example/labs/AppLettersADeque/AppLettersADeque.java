package com.example.labs.AppLettersADeque;

import java.util.*;

/*
Zadanie:
        Litery wężykiem! Zadanie składa się z dwóch części. Należy je zrealizować przy pomocy wewnętrznego edytora Kodilla w ramach jednego projektu.

        Część 1
        Napisz program, który w kolejce ArrayDeque umieści 50 obiektów przechowujących napisy (ciągi znaków), składające się z litery 'a' powtórzonej losową ilość razy (zakres powtórzeń: 1-50).
        Wypełnienie obiektu powtórzeniami litery 'a' zrealizuj przy pomocy pętli for.

        Część 2
        Program z części pierwszej rozbuduj w taki sposób, że przekażesz utworzoną kolejkę do metody Twojej klasy,
        która dokona rozdzielenia obiektów z kolejki na dwie kolekcje ArrayList.
        Jedna z nich będzie przechowywała obiekty o parzystej liczbie znaków 'a', a druga o nieparzystej.
*/

public class AppLettersADeque {
    public static void main(String[] args) {
        ArrayDeque<String> dequeOfA = new ArrayDeque<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            dequeOfA.push("a".repeat(random.nextInt(50) + 1));
        }
        System.out.println("Kolejka Deque: " + dequeOfA);

        TwoLists twoLists = new TwoLists();
        twoLists.separatorArrayDeque(dequeOfA);
    }
}

class TwoLists {
    List<String> listEven = new ArrayList<>(); //Lista parzysta
    List<String> listOdd = new ArrayList<>(); //Lista nieparzysta

    public void separatorArrayDeque(ArrayDeque<String> dequeOfA) {
        Iterator iterator = dequeOfA.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next().toString();
            if (element.length() % 2 == 0) {
                listEven.add(element);
            } else {
                listOdd.add(element);
            }
        }

        System.out.println("Lista parzysta: " + listEven);
        System.out.println("Lista nieparzysta: " + listOdd);
    }


}

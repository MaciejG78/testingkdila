package com.example.labs.AppSpeedMeasurement;

/*
Zadanie: pomiar szybkości LinkedList oraz HashMapZadanie składa się z dwóch części.
        Jedna dotyczy LinkedList, a druga HashMap. Oba programy napisz w wewnętrznym edytorze i zapisz je jako jeden projekt.

        Część 1
        Stwórz klasę reprezentującą książkę o nazwie Book. Klasa powinna mieć dwa pola: author oraz title.
        Pamiętaj o implementacji metod hashCode() oraz equals(Object o).
        Będziemy jej używali jako obiektów kolekcji LinkedList w tej części zadania oraz jako obiektów kolekcji HashMap w drugiej części zadania.
        Stwórz program, który zmierzy czas operacji wyszukiwania i usunięcia obiektu na początku (z użyciem metody remove(Object o)),
        wyszukiwania i usunięcia obiektu na końcu (z użyciem metody remove(Object o)),
        wstawiania na początku oraz wstawiania na końcu listy LinkedList liczącej kilkaset tysięcy obiektów.

        Część 2
        Stwórz program, który zmierzy czas operacji wyszukiwania po kluczu, a także czas dodawania i usuwania obiektu z mapy HashMap liczącej kilkaset tysięcy obiektów.
        Postaraj się, aby kluczem w mapie nie była wartość liczbowa.
*/

import java.util.*;

public class AppSpeedMeasurement {
    public static void main(String[] args) throws java.lang.Exception {

        LinkedList<Book> bookList = new LinkedList<>();
        HashMap<String, Book> bookMap = new HashMap<>();

        for (int i = 0; i < 500000; i++) {
            String author = "Author: " + UUID.randomUUID();
            String title = "Title: " + UUID.randomUUID();
            String key = "Key: " + UUID.randomUUID();

            bookList.add(new Book(author, title));
            bookMap.put(key, new Book(author, title));
        }

        LinkedListMesurement linkedListMesurement = new LinkedListMesurement();
        linkedListMesurement.mesure(bookList);

        HashMapMesurement hashMapMesurement = new HashMapMesurement();
        hashMapMesurement.mesure(bookMap);
    }
}

class Book {
    private String author;
    private String title;

    public Book() {
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Book: author: " + author + ", title: " + title;
    }
}

class LinkedListMesurement {
    public void mesure(LinkedList<Book> bookList) {
        System.out.println("Liczba elementów w kolekcji LinkedList: " + bookList.size() + "\n");
        System.out.println("Aktualny pierwszy element w kolekcji LinkedList to: " + bookList.get(0));
        System.out.println("Aktualny ostatni element w kolekcji LinkedList to: " + bookList.get(bookList.size() - 1));

        System.out.println("===================== Dodanie elementu na końcu kolekcji LinkedList (add) ==========================");
        long startTime1 = System.nanoTime();
        bookList.add(new Book("New last author", "New last title"));
        long endTime1 = System.nanoTime();
        System.out.println("Dodanie elementu na końcu kolekcji LinkedList wynosi: " + (endTime1 - startTime1) + " ns\n");

        System.out.println("===================== Dodanie elementu na początku kolekcji LinkedList (add) ==========================");
        long startTime2 = System.nanoTime();
        bookList.add(0, new Book("New first author", "New first title"));
        long endTime2 = System.nanoTime();
        System.out.println("Dodanie elementu na początku kolekcji LinkedList wynosi: " + (endTime2 - startTime2) + " ns\n");

        System.out.println("Liczba elementów w kolekcji LinkedList: " + bookList.size());
        System.out.println("Aktualny pierwszy element w kolekcji LinkedList to: " + bookList.get(0));
        System.out.println("Aktualny ostatni element w kolekcji LinkedList to: " + bookList.get(bookList.size() - 1) + "\n");

        System.out.println("===================== Usunięcie elementu z końca kolekcji LinkedList (remove) ==========================");
        long startTime3 = System.nanoTime();
        bookList.remove(bookList.size() - 1);
        long endTime3 = System.nanoTime();
        System.out.println("Usunięcie elementu z końca kolekcji LinkedList wynosi: " + (endTime3 - startTime3) + " ns\n");

        System.out.println("===================== Usunięcie elementu z początku kolekcji LinkedList (remove) ==========================");
        long startTime4 = System.nanoTime();
        bookList.remove(0);
        long endTime4 = System.nanoTime();
        System.out.println("Usunięcie elementu z początku kolekcji LinkedList wynosi: " + (endTime4 - startTime4) + " ns\n");

        System.out.println("Liczba elementów w kolekcji LinkedList: " + bookList.size() + "\n");
        System.out.println("Aktualny pierwszy element w kolekcji LinkedList to: " + bookList.get(0));
        System.out.println("Aktualny ostatni element w kolekcji LinkedList to: " + bookList.get(bookList.size() - 1));
        System.out.println();

        System.out.println("===================== Dodanie elementu na końcu kolekcji LinkedList (addLast) ==========================");
        long startTime5 = System.nanoTime();
        bookList.addLast(new Book("New last author", "New last title"));
        long endTime5 = System.nanoTime();
        System.out.println("Dodanie elementu na końcu kolekcji LinkedList wynosi: " + (endTime5 - startTime5) + " ns\n");

        System.out.println("===================== Dodanie elementu na początku kolekcji LinkedList (addFirst) ==========================");
        long startTime6 = System.nanoTime();
        bookList.addFirst(new Book("New first author", "New first title"));
        long endTime6 = System.nanoTime();
        System.out.println("Dodanie elementu na początku kolekcji LinkedList wynosi: " + (endTime6 - startTime6) + " ns\n");

        System.out.println("Liczba elementów w kolekcji LinkedList: " + bookList.size());
        System.out.println("Aktualny pierwszy element w kolekcji LinkedList to: " + bookList.get(0));
        System.out.println("Aktualny ostatni element w kolekcji LinkedList to: " + bookList.get(bookList.size() - 1) + "\n");

        System.out.println("===================== Usunięcie elementu z końca kolekcji LinkedList (removeLast) ==========================");
        long startTime7 = System.nanoTime();
        bookList.removeLast();
        long endTime7 = System.nanoTime();
        System.out.println("Usunięcie elementu z końca kolekcji LinkedList wynosi: " + (endTime7 - startTime7) + " ns\n");

        System.out.println("===================== Usunięcie elementu z początku kolekcji LinkedList (removeFirst) ==========================");
        long startTime8 = System.nanoTime();
        bookList.removeFirst();
        long endTime8 = System.nanoTime();
        System.out.println("Usunięcie elementu z początku kolekcji LinkedList wynosi: " + (endTime8 - startTime8) + " ns\n");

        System.out.println("Liczba elementów w kolekcji LinkedList: " + bookList.size() + "\n");
        System.out.println("Aktualny pierwszy element w kolekcji LinkedList to: " + bookList.get(0));
        System.out.println("Aktualny ostatni element w kolekcji LinkedList to: " + bookList.get(bookList.size() - 1));
        System.out.println();
    }
}

class HashMapMesurement {
    public void mesure(HashMap<String, Book> bookMap) {
        System.out.println("Liczba elementów w kolekcji HashMap: " + bookMap.size() + "\n");

        System.out.println("===================== Dodanie elementu do HashMap (put) ==========================");
        long startTime1 = System.nanoTime();
        bookMap.put("New key", new Book("New last author", "New last title"));
        long endTime1 = System.nanoTime();
        System.out.println("Dodanie elementu do HashMap wynosi: " + (endTime1 - startTime1) + " ns\n");

        System.out.println("===================== Wyszukanie elementu w HashMap (get) ==========================");
        long startTime3 = System.nanoTime();
        bookMap.get("New key");
        long endTime3 = System.nanoTime();
        System.out.println("Wyszukanie elementu w HashMap wynosi: " + (endTime3 - startTime3) + " ns\n");

        System.out.println("===================== Usunięcie elementu z HashMap (remove) ==========================");
        long startTime2 = System.nanoTime();
        bookMap.remove("New key");
        long endTime2 = System.nanoTime();
        System.out.println("Usnięcie elementu z HashMap wynosi: " + (endTime2 - startTime2) + " ns\n");

        System.out.println("Liczba elementów w kolekcji HashMap: " + bookMap.size());

    }
}

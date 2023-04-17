package com.example.labs.AppSredniaBezSkrajnych;


import java.util.*;
/*
Zadanie:Średnia bez skrajnych ocen oraz lista obiektów Book
        Zadanie składa się z dwóch części – jedna dotyczy ArrayList,a druga LinkedList.
        Obie części należy zrealizować wewnątrz edytora Kodilli.
        Oba rozwiązania powinny być w ramach jednego projektu.
        Część 1
        Napisz program przy użyciu listy ArrayList zawierającej kilkanaście ocen z przedmiotu Informatyka w liceum.
        Wypełnij listę przykładowymi ocenami.Następnie przy pomocy pętli for oblicz średnią ocenę ucznia (średnia arytmetyczna),
        ale w taki sposób, że pominięte zostaną skrajne oceny – JEDNA najmniejsza i JEDNA największa.

        Oceny największą i najmniejszą należy odnaleźć.
        Przykładowo, dla ocen: 3,3,4,4,4,5,5,5,6 – do obliczenia średniej wzięte zostaną oceny: 3,4,4,4,5,5,5
        4,4,4,4,4,4,4 – do obliczenia średniej wzięte zostaną oceny: 4,4,4,4,4

        Część 2
        Napisz program przy użyciu listy LinkedList, zawierającej obiekty opisujące książki.
        Każda książka powinna mieć tytuł i rok wydania.
        Wypełnij listę kilkoma przykładowymi pozycjami.
        Następnie przy pomocy pętli for-each wyświetl tylko te książki z listy, dla których rok wydania nie jest mniejszy niż 2000.*/

public class AppSredniaBezSkrajnych {

    public static void main(String[] args) {
        ArrayList<Integer> listOfMarks = new ArrayList<>(Arrays.asList(3, 3, 4, 4, 4, 5, 5, 5, 6));
        AverageCalculation averageCalculation = new AverageCalculation();
        averageCalculation.calculateAverage(listOfMarks);

        Book book1 = new Book("Przygody Tomka Sawyera", 2004);
        Book book2 = new Book("Mikołajek i przyjaciele", 2010);
        Book book3 = new Book("W pustyni i w puszczy", 2009);
        Book book4 = new Book("Krzyżacy", 2000);
        Book book5 = new Book("Ogniem i mieczem", 1980);
        Book book6 = new Book("Pan Tadeusz", 1996);

//        LinkedList<Book> bookList = new LinkedList<>(Arrays.asList(book1, book2, book3, book4, book5, book6));

        LinkedList<Book> bookList = new LinkedList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

//        List<Book> bookList2 = new LinkedList<>(Arrays.asList(book1, book2, book3, book4, book5, book6));
//
//        Collection<Book> bookList3 = new LinkedList<>(Arrays.asList(book1, book2, book3, book4, book5, book6));

        Book book = new Book();
        book.showBooksAfter2000(bookList);
    }
}

class AverageCalculation {
    public void calculateAverage(ArrayList<Integer> listOfMarks) {
        Integer minValue = null;
        Integer maxValue = null;
        Long sum = 0L;

        for (int i = 0; i < listOfMarks.size(); i++) {
            if (i == 0) {
                minValue = listOfMarks.get(i);
                maxValue = listOfMarks.get(i);
            }
            if (listOfMarks.get(i) < minValue) {
                minValue = listOfMarks.get(i);
            }
            if (listOfMarks.get(i) > maxValue) {
                maxValue = listOfMarks.get(i);
            }

            sum += listOfMarks.get(i);
        }
        Long sumAfterSubstract = sum - (minValue + maxValue);
        System.out.println("Suma wszystkich wartości wynosi: " + sum);
        System.out.println("Suma wartości po odjęciu skrajnych wynosi: " + sumAfterSubstract);
        System.out.println("Średnia wynosi: " + ((double) sumAfterSubstract / (listOfMarks.size() - 2)));
    }
}

class Book {
    String title;
    Integer publicationYear;

    public Book() {
    }

    public Book(String title, Integer publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void showBooksAfter2000(LinkedList<Book> bookList) {
        System.out.println("Książki których rok wydania jest nie miniejszy niż 2000:");
        for (int i=0; i < bookList.size(); i++) {
            if (bookList.get(i).publicationYear >= 2000) {
//                System.out.println(bookList.get(i).toString());
                System.out.println("Tytuł: " + bookList.get(i).title + ", rok wydania: " + bookList.get(i).publicationYear);

            }
        }
    }

    @Override
    public String toString() {
        return "Book { title: " + title + ", publicationYear: " + publicationYear + "}";
    }
}

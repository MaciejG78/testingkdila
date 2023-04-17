package com.example.labs.AppBookFilter;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

//Zadanie: Filtrowanie zbioru książek
//        Przy użyciu wewnętrznego edytora Kodilla napisz program,
//        który będzie przechowywał w zbiorze HashSet zestaw kilku obiektów reprezentujących książki.
//        Każda książka powinna mieć tytuł, autora i rok wydania.
//        Nie zapomnij również o zdefiniowaniu metod hashCode() oraz equals() dla swoich książek.
//        Następnie przy pomocy poznanej w poprzednim module pętli for-each wyświetl w oknie konsoli tytuły wszystkich
//        książek znajdujących się w zbiorze, które zostały wydane przed 2010 rokiem.
//        Rozwiązane zadanie wyślij do Mentora.
public class AppBookFilter {
    public static void main(String[] args) {

        Book book1 = new Book("Tom & Yerry", "Autor Nieznany" , 2010);
        Book book2 = new Book("Micky Mouse", "Disney" , 2006);
        Book book3 = new Book("Java podstawy", "Eckel" , 2008);
        Book book4 = new Book("Kotlin", "Maria Konopnicka" , 2020);
        Book book5 = new Book("Imperium Apple", "Steven Jobs" , 2009);
        Book book6 = new Book("Html i CSS", "Autor Testowy " , 2008);

        HashSet<Book> books = new HashSet<>();
        books.addAll(List.of(book1, book2, book3, book4, book5, book6));

        books.iterator();

        for (Book book : books) {
            if (book.publicationYear < 2010) {
                System.out.println(book.title);
            }
        }

    }

}

class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

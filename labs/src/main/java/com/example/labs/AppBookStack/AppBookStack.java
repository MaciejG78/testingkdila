package com.example.labs.AppBookStack;

import java.util.ArrayDeque;
import java.util.Objects;

public class AppBookStack {
    public static void main(String[] args) {
        Book book1 = new Book("Java w 24h", "Joshua Blosh", 2010);
        Book book2 = new Book("Kotlin", "Bruce Eckel", 2016);
        Book book3 = new Book("Pojedynek z syberią", "Andrzej Koperski", 2008);
        Book book4 = new Book("Git", "Jurand ze Spychowa", 2016);
        Book book5 = new Book("C++ w 24h", "Maćko z Bogdańca", 2020);
        Book book6 = new Book("C++ w 24h", "Maćko z Bogdańca", 2020);

        ArrayDeque<Book> stack = new ArrayDeque<>();
        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        stack.push(book4);
        stack.push(book5);

        System.out.println("Zawartość stosu: " + stack);
        System.out.println("Rozmiar stosu: " + stack.size());
        stack.pop();
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Element kolejny na stosie: " + stack.peek());
        System.out.println("Zawartość stosu: " + stack);
        stack.pop();
        System.out.println("Rozmiar stosu: " + stack.size());

        System.out.println("book1: " + book1.hashCode());
        System.out.println("book2: " + book2.hashCode());
        System.out.println("book3: " + book3.hashCode());
        System.out.println("book4: " + book4.hashCode());
        System.out.println("book1: " + book1.hashCode());
        System.out.println("book5: " + book5.hashCode());
        System.out.println("book6: " + book6.hashCode());
    }
}


class Book {
    String name;
    String author;
    Integer publicationYear;

    public Book(String name, String author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{name: " + name + ", author: " + author + ", publicationYear: " + publicationYear + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublicationYear(), book.getPublicationYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getPublicationYear());
    }
}
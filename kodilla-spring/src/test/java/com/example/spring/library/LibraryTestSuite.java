package com.example.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = LibraryDbController.class)
class LibraryTestSuite {

    @Test
    void testLoadFromDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.spring");
        Library library = context.getBean(Library.class);

        //When
        library.loadFromDb();

        //Then
        //do nothing
    }

    @Test
    void testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.spring");
        Library library = context.getBean(Library.class);

        //When
        library.saveToDb();

        //Then
        //do nothing
    }

}

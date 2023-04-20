package com.example.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

//@SpringBootTest(classes = { Board.class, TaskList.class })
public class BoardTestSuite {

    @Test
    @DisplayName("Czy zostały utworzone Bean-y")
    public void testIfBeanExist() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring.portfolio");

        //When
        boolean beanBoardExists = context.containsBean("board");
        boolean beanToDoListExists = context.containsBean("toDoList");
        boolean beanInProgressListExists = context.containsBean("inProgressList");
        boolean beanDoneListExists = context.containsBean("doneList");

        //Then
        Assertions.assertTrue(beanBoardExists);
        Assertions.assertTrue(beanToDoListExists);
        Assertions.assertTrue(beanInProgressListExists);
        Assertions.assertTrue(beanDoneListExists);
    }

    @Test
    @DisplayName("czy dodane zadania da się odczytać")
    void testIfAddedTasksCouldRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring.portfolio");

        //When
        Board board = (Board) context.getBean("board");

        List<String> tasksToDoList = board.getToDoList().getTasks();
        tasksToDoList.add("Zadanie 1 dla ToDoList");
        tasksToDoList.add("Zadanie 2 dla ToDoList");

        List<String> tasksInProgressList = board.getInProgressList().getTasks();
        tasksInProgressList.add("Zadanie 1 dla InProgressList");

        List<String> tasksDoneList = board.getDoneList().getTasks();
        tasksDoneList.add("Zadanie 1 dla DoneList");
        tasksDoneList.add("Zadanie 2 dla DoneList");
        tasksDoneList.add("Zadanie 3 dla DoneList");

        //Then
        Assertions.assertEquals(2, tasksToDoList.size());
        Assertions.assertEquals("Zadanie 2 dla ToDoList", tasksToDoList.get(1));
        Assertions.assertEquals(1, tasksInProgressList.size());
        Assertions.assertEquals("Zadanie 1 dla InProgressList", tasksInProgressList.get(0));
        Assertions.assertEquals(3, tasksDoneList.size());
        Assertions.assertEquals("Zadanie 3 dla DoneList", tasksDoneList.get(2));
    }
}

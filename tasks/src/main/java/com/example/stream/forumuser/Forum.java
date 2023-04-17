package com.example.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Forum {

    private List<ForumUser> forumUserList;

    public Forum() {
        this.forumUserList = List.of(
                new ForumUser(1, "Alicja", 'F', LocalDate.of(1980, Month.APRIL, 10), 100),
                new ForumUser(2, "Tomasz", 'M', LocalDate.of(2001, Month.DECEMBER, 11), 0),
                new ForumUser(3, "Zenobiusz", 'M', LocalDate.of(2004, Month.JANUARY, 13), 4),
                new ForumUser(4, "Tadeusz", 'M', LocalDate.of(1975, Month.MARCH, 17), 75),
                new ForumUser(5, "Krzysztof", 'M', LocalDate.of(1990, Month.MAY, 15), 87),
                new ForumUser(6, "Agnieszka", 'F', LocalDate.of(2004, Month.JULY, 25), 0),
                new ForumUser(7, "Anna", 'F', LocalDate.of(2005, Month.JUNE, 15), 2),
                new ForumUser(8, "Rajmund", 'M', LocalDate.of(1993, Month.AUGUST, 30), 1),
                new ForumUser(9, "Renata", 'F', LocalDate.of(1985, Month.SEPTEMBER, 18), 55),
                new ForumUser(10, "Gwidon", 'M', LocalDate.of(2008, Month.OCTOBER, 4), 0)
        );
    }

    public List<ForumUser> getForumUserList() {
        return forumUserList;
    }

}

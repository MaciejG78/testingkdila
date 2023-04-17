package com.example.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int userId;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postsCounter;

    public ForumUser(int userId, String userName, char sex, LocalDate dateOfBirth, int postsCounter) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsCounter = postsCounter;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsCounter() {
        return postsCounter;
    }

    @Override
    public String toString() {
        return "userId: " + userId + ", userName: " + userName + ", sex: " + sex + ", dateOfBirth: " + dateOfBirth + ", postsCounter: " + postsCounter;
    }
}

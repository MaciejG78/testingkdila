package com.example.stream.immutable;

public final class ForumUserFinal {

    private final String username;
    private final String realName;

    public ForumUserFinal(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}

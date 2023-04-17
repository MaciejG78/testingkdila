package com.example.rockpaperscissors;

public enum Move {
    ROCK("kamien"),
    PAPER("papier"),
    SCISSORS("nozyczki");

    private String value;

    Move(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

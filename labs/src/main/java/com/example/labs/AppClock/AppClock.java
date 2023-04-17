package com.example.labs.AppClock;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class AppClock {

    public static void main(String[] args) {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock();
        Clock clock3 = new Clock();

        LinkedList<Clock> clocks = new LinkedList<>();
        clocks.addAll(List.of(clock1, clock2, clock3));

        int i = 0;
        for (Clock clock : clocks) {
            clock.time = clock.time.plusMinutes(i);
            i++;
            clock.printTime();
        }
    }

}


class Clock {
    LocalDateTime time = LocalDateTime.now();

    void printTime() {
        System.out.println(this.time);
    }
}
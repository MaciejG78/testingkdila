package com.example.good.patterns.airlines;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    public void searchTo(Set<Flight> flights, String airPort) {
        flights.stream()
                .filter(flight -> flight.getAirPortTo().equals(airPort))
                .forEach(System.out::println);
    }

    public void searchFrom(Set<Flight> flights, String airPort) {
        flights.stream()
                .filter(flight -> flight.getAirPortFrom().equals(airPort))
                .forEach(System.out::println);
    }

    public void searchThrough(Set<Flight> flights, String airPortFrom, String airPortThrough, String airPortTo) {
        Set<Flight> listFromToThrough = flights.stream()
                .filter(flight -> flight.getAirPortFrom().equals(airPortFrom) && flight.getAirPortTo().equals(airPortThrough))
                .collect(Collectors.toSet());
        Set<Flight> listThroughToTo = flights.stream()
                .filter(flight -> flight.getAirPortFrom().equals(airPortThrough) && flight.getAirPortTo().equals(airPortTo))
                .collect(Collectors.toSet());

        if (listFromToThrough.size() != 0 && listThroughToTo.size() != 0) {
            for (Flight flight1 : listFromToThrough) {
                for (Flight flight2 : listThroughToTo) {
                    if (flight1.getAirPortTo().equals(flight2.getAirPortFrom())) {
                        System.out.println(flight1);
                        System.out.println(flight2);
                    }
                }
            }
        } else {
            System.out.println("Brak wskazanego połączenia");
        }
    }
}

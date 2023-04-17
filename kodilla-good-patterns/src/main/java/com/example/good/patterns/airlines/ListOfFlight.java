package com.example.good.patterns.airlines;

import java.util.HashSet;
import java.util.Set;

public class ListOfFlight {

    private Set<Flight> flights = new HashSet<>();

    public ListOfFlight() {
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Krakow", "Poznan"));
        flights.add(new Flight("Gdańsk", "Kraków"));
        flights.add(new Flight("Kraków", "Wrocław"));
        flights.add(new Flight("Wroclaw", "Poznan"));
        flights.add(new Flight("Gdansk", "Warszawa"));
        flights.add(new Flight("Wroclaw", "Gdańsk"));
        flights.add(new Flight("Lublin", "Gdańsk"));
        flights.add(new Flight("Kraków", "Lublin"));
        flights.add(new Flight("Lublin", "Wrocław"));
        flights.add(new Flight("Lublin", "Kraków"));
        flights.add(new Flight("Kraków", "Warszawa"));
    }

    public Set<Flight> getTheList() {
        return flights;
    }

}

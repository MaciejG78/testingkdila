package com.example.good.patterns.airlines;

import java.util.Set;

public class AirLinesApp {
    public static void main(String[] args) {
        ListOfFlight listOfFlight = new ListOfFlight();
        Set<Flight> flights = listOfFlight.getTheList();
        Search search = new Search();

        System.out.println("\nFlights from Gdańsk:");
        search.searchFrom(flights, "Gdańsk");

        System.out.println("\nFlights to Wrocław:");
        search.searchTo(flights, "Wrocław");

        System.out.println("\nFlights from Gdańsk to Wrocław through Kraków:");
        search.searchThrough(flights, "Gdańsk", "Kraków", "Wrocław");
    }
}

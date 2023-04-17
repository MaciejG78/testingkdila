package com.example.good.patterns.airlines;

import java.util.Objects;

public class Flight {

    private String airPortFrom;
    private String airPortTo;


    public Flight(String airPortFrom, String airPortTo) {
        this.airPortFrom = airPortFrom;
        this.airPortTo = airPortTo;
    }

    public String getAirPortFrom() {
        return airPortFrom;
    }

    public String getAirPortTo() {
        return airPortTo;
    }

    @Override
    public String toString() {
        return "AirPortFrom=" + airPortFrom + ", AirPortTo=" + airPortTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (airPortFrom != null ? !airPortFrom.equals(flight.airPortFrom) : flight.airPortFrom != null)
            return false;
        return airPortTo != null ? airPortTo.equals(flight.airPortTo) : flight.airPortTo == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airPortFrom, airPortTo);
    }
}

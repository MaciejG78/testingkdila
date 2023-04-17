package com.example.stream.world;

import java.util.List;

public class Continent {
    private List<Country> continentCountries;
    private String continentName;

    public Continent(List<Country> continentCountries, String continentName) {
        this.continentCountries = continentCountries;
        this.continentName = continentName;
    }

    public List<Country> getContinentCountries() {
        return continentCountries;
    }

    public String getContinentName() {
        return continentName;
    }

}

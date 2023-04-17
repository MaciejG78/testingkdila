package com.example.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private List<Continent> worldContinents;

    public World(List<Continent> worldContinents) {
        this.worldContinents = worldContinents;
    }

    public List<Continent> getWorldContinents() {
        return worldContinents;
    }

    public BigDecimal getPeopleQuantity(){
        return worldContinents.stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
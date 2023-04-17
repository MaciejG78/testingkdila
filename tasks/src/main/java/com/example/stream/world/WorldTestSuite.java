package com.example.stream.world;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Polska", new BigDecimal(38000001));
        Country niemcy = new Country("Niemcy", new BigDecimal(84000001));
        Country holandia = new Country("Holandia", new BigDecimal(17000001));
        Country francja = new Country("Francja", new BigDecimal(68000001));
        Country japonia = new Country("Japonia", new BigDecimal(124000001));
        Country chiny = new Country("Chiny", new BigDecimal(1410000001));
        Country rosja = new Country("Rosja", new BigDecimal(142000001));
        Country usa = new Country("Usa", new BigDecimal(308000001));
        Country kanada = new Country("Kanada", new BigDecimal(34000001));
        Country brazylia = new Country("Brazylia", new BigDecimal(217000001));
        Country australia = new Country("Australia", new BigDecimal(25000001));
        Country egipt = new Country("Egipt", new BigDecimal(107000001));
        Country nigeria = new Country("Nigeria", new BigDecimal(225000001));

        Continent europe = new Continent(List.of(poland, niemcy, holandia, francja), "Europa");
        Continent asia = new Continent(List.of(japonia, chiny, rosja), "Asia");
        Continent northAmerica = new Continent(List.of(usa, kanada), "Ameryka Północna");
        Continent southAmerica = new Continent(List.of(brazylia), "Ameryka Południowa");
        Continent australiaCon = new Continent(List.of(australia), "Australia");
        Continent africa = new Continent(List.of(egipt, nigeria), "Afryka");

        World world = new World(List.of(europe, asia, northAmerica, southAmerica, australiaCon, africa));

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("2799000013"), totalPeople);
    }

}

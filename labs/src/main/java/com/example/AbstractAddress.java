package com.example;

public abstract class AbstractAddress {

    String city;
    String streetName;
    Integer buildingNumber;
    String localNumber;
    String postCode;

    abstract String getStreetWithNumbers();

    String getFullAddress() {
        return "Ulica: " + this.streetName + " " + this.buildingNumber + "/" + this.localNumber + ", "
                + postCode + " " + city;
    }

}

package com.example;

public class Address extends AbstractAddress{

    String county; //powiat

    public Address(String county) {
        this.county = county;
    }

    public Address(String county, String city, String streetName, Integer buildingNumber, String localNumber, String postCode) {
        this.county = county;
        super.city = city;
        super.streetName = streetName;
        super.buildingNumber = buildingNumber;
        super.localNumber = localNumber;
        super.postCode = postCode;
    }


    public void showCountyName() {
        System.out.println("Posiadam: " + this.county);
    }

    String getSomethig() { return this.city; };

    @Override
    String getStreetWithNumbers() {
        return streetName + " " + buildingNumber + "/ " + localNumber;
    }
}

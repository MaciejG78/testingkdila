package com.example;

public class AddressMain extends AbstractAddress{

    String village; //wioska

    public AddressMain(String village) {
        this.village = village;
    }

    public AddressMain(String village, String city, String streetName, Integer buildingNumber, String localNumber, String postCode) {
        this.village = village;
        super.city = city;
        super.streetName = streetName;
        super.buildingNumber = buildingNumber;
        super.localNumber = localNumber;
        super.postCode = postCode;
    }


    public void showCountyName() {
        System.out.println("Posiadam wioskę o nazwie: " + this.village);
    }

    @Override
    String getStreetWithNumbers() {
        return village + " " + buildingNumber + "/ " + localNumber;
    }
}

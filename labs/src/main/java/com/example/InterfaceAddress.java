package com.example;

public interface InterfaceAddress {

    String streetName = "";
    Integer buildingNumber = null;
    String localNumber = "";
    String postCode ="";


    static String getAddressWithStreet() {
        return "Ulica: " + streetName + " " + buildingNumber + "/" + localNumber + ", "
                + postCode;
    }

}

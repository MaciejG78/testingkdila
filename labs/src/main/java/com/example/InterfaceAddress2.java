package com.example;

public interface InterfaceAddress2 {

    public static final String URL = "http://wp.pl";

    String city = "Lublin";

    String getCity();

    static String getAddressCity() {
        return "Miasto: " + city;
    }

}

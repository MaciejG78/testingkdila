package com.example;

public class Address2 implements InterfaceAddress, InterfaceAddress2 {

    String county; //powiat

    public Address2(String county) {
        this.county = county;
    }

    @Override
    public String getCity() {
        return city;
    }
}
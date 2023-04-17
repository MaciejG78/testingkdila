package com.example;

public class AddressTemplate {

    private static final String URL = "./tmp/out.xlsx";

    public AddressTemplate() {}

    public AddressTemplate(String streetName, Integer numberBuilding, String localNumber, String postCode, String city) {
        this.streetName = streetName;
        this.numberBuilding = numberBuilding;
        this.localNumber = localNumber;
        this.postCode = postCode;
        this.city = city;
    }

    public AddressTemplate(String streetName, Integer numberBuilding, String localNumber, String postCode, String city, String country) {
        this.streetName = streetName;
        this.numberBuilding = numberBuilding;
        this.localNumber = localNumber;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
    }

    private String streetName;
    private Integer numberBuilding;
    private String localNumber;
    private String postCode;
    private String city;
    private String country = "Poland";

    protected Long numberOfCitizens;

    public Long numberOfParkingPlaces;

    public Long getAllParkingPlaces() {
        Long numberOfGaragePlaces = 10L;
        return numberOfParkingPlaces + numberOfGaragePlaces;
    }

    public String getStreetName() {

        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getNumberBuilding() {
        return numberBuilding;
    }

    public void setNumberBuilding(Integer numberBuilding) {
        this.numberBuilding = numberBuilding;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    private String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityName() {
        return getCity().toUpperCase();
    }

    public Long getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public void setNumberOfCitizens(Long numberOfCitizens) {
        this.numberOfCitizens = numberOfCitizens;
    }

    public Long getNumberOfParkingPlaces() {
        return numberOfParkingPlaces;
    }

    public void setNumberOfParkingPlaces(Long numberOfParkingPlaces) {
        this.numberOfParkingPlaces = numberOfParkingPlaces;
    }

    @Override
    public String toString() {
        return "Address{ Ul. " + streetName + " " + numberBuilding + "/" + localNumber + '\'' +
                postCode + city + '\'' +
                country + '\'' +
                '}';
    }
}

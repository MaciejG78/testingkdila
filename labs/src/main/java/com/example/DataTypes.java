package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class DataTypes {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataTypes)) return false;
        DataTypes dataTypes = (DataTypes) o;
        return byteValue == dataTypes.byteValue && shortValue == dataTypes.shortValue && intValue == dataTypes.intValue && longValue == dataTypes.longValue && Float.compare(dataTypes.floatValue, floatValue) == 0 && Double.compare(dataTypes.doubleValue, doubleValue) == 0 && charValue == dataTypes.charValue && booleanValue == dataTypes.booleanValue && enumValue == dataTypes.enumValue && integerValue.equals(dataTypes.integerValue) && getSumOfInt().equals(dataTypes.getSumOfInt()) && getLongValueO().equals(dataTypes.getLongValueO()) && byteValueO.equals(dataTypes.byteValueO) && getStringValue().equals(dataTypes.getStringValue()) && getBigDecimalValue().equals(dataTypes.getBigDecimalValue()) && getBooleanValueO().equals(dataTypes.getBooleanValueO());
    }

    @Override
    public int hashCode() {
        return Objects.hash(byteValue, shortValue, intValue, longValue, floatValue, doubleValue, charValue, booleanValue, enumValue, integerValue, getSumOfInt(), getLongValueO(), byteValueO, getStringValue(), getBigDecimalValue(), getBooleanValueO());
    }

    public Integer getSumOfInt() {
        return sumOfInt;
    }

    public void setSumOfInt(Integer sumOfInt) {
        this.sumOfInt = sumOfInt;
    }

    public Long getLongValueO() {
        return longValueO;
    }

    public void setLongValueO(Long longValueO) {
        this.longValueO = longValueO;
    }

    public BigDecimal getBigDecimalValue() {
        return bigDecimalValue;
    }

    public void setBigDecimalValue(BigDecimal bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public Boolean getBooleanValueO() {
        return booleanValueO;
    }

    public void setBooleanValueO(Boolean booleanValueO) {
        this.booleanValueO = booleanValueO;
    }

    public DataTypes() {}

    public DataTypes(String stringValueFromConstructor) {
        this.stringValue = stringValueFromConstructor;
    }

    // typy prymitywne (liczby całkowite)
    byte byteValue = 1; // 1 bajt
    short shortValue = 3; // 2 bajty
    int intValue = 3; // 4 bajty
    long longValue = 1234567; // 8 bajtow

    //typy prymitywne (liczby zmiennoprzecinkowe)
    float floatValue = 4.3F; // 4 bajty
    double doubleValue = 3.14159D; // 8 bajtów

    // typy prymitywne - typ znakowy
    char charValue = 'A';

    // typ prymitywny (true / false)
    boolean booleanValue = true;

    Size enumValue = Size.BIG; //Typ wyliczeniowy enum

    // Typy obiektowe
    Integer integerValue = 10;

    Integer sumOfInt = integerValue + 5;

    Long longValueO = 1013123L;
    Byte byteValueO = 1;
    String stringValue = "Taki przykładowy domyślny tekst";
    BigDecimal bigDecimalValue = new BigDecimal(121323.213);

    Boolean booleanValueO = Boolean.TRUE;

    public String printValues() {
        bigDecimalValue.setScale(2, RoundingMode.UP);
        System.out.println(stringValue.equals("safdsd"));
        return "Wynik metody";
    }

    public String getStringValue() {
        return stringValue;
    }

    private void calculateValue() {
        System.out.println(2);
    }

}

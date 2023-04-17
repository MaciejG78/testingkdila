package com.example;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Dom dom = new Dom(10.05, 5,
                List.of(new Okno(2, false, 2, false),
                        new Okno(3, false, 2, false)),
                List.of(new Okno(4, false, 1, true)));

        List<Okno> listaOkien = dom.listaOkien;
        List<Okno> listaOkienDachowych = dom.listaOkienDachowych;

        System.out.println(dom.listaOkien.get(0).czySzprosy);

        Dom dom1 = new Dom(10.65, 6);
        Dom dom2 = new Dom(5.05, 3);


        String kolor1 = dom1.paint("Biały");
        System.out.println(kolor1);

        System.out.println(dom2.paint("Czerwony"));
//
//        Integer nowyWymiarDomu1 = dom1.rozbudujDom(10);
//        Integer nowyWymiarDomu2 = dom2.iloscPomieszczen;
//
//        System.out.println(nowyWymiarDomu1);
//        System.out.println(nowyWymiarDomu2);


//        BMI bmi = new BMI();
//        bmi.calculateBMI();
//        bmi.showDocumentType(DocumentType.PODANIE);
//        bmi.forLoop(10);

/*
Podaj ilość poziomów drzewka wysokość: 5
   *
  ***
 *****
*******
  ***
 */
//        ChristmasTree christmasTree = new ChristmasTree();
//        christmasTree.christmasTree();



//        ConditionsStatements conditionsStatements = new ConditionsStatements();
//
//        System.out.println(conditionsStatements.comparingIfXBiggerThanY(10, 10));
//
//        System.out.println(conditionsStatements.comparingShortIfXBiggerThanY(50, 10));
//        System.out.println(conditionsStatements.comparingShortIfXBiggerThanY(5, 10));
//        System.out.println(conditionsStatements.comparingShortIfXBiggerThanY(50, 50));
//



//        Address address1 = new Address("warszawski", "Warszawa", "Spokojna", 1 , "2b", "90-950");
//        Address address2 = new Address("łódzki", "Łódź", "Cicha", 4, "5346", "33-435");
//
//        AddressMain address3 = new AddressMain("Wioska Serfów", "Łódź", "Cicha", 4, "5346", "33-435");
//
//
//        System.out.println(address1.getStreetWithNumbers());
//        System.out.println(address2.getStreetWithNumbers());
//        System.out.println(address3.getStreetWithNumbers());
//
//        address1.showCountyName();
//        System.out.println("Testowy tekst: " + address1.county);
//
//
//


//        DataTypes dataTypes = new DataTypes();
//        System.out.println("Wartość dla stringValue: " + dataTypes.getStringValue());
//
//        DataTypes dataTypes1 = new DataTypes("Wartość nowa dla Stringa");
//        System.out.println("Wartość dla stringValue: " + dataTypes1.getStringValue());
//
//        System.out.println(dataTypes.equals(dataTypes));
//
//        System.out.println(dataTypes.toString());
//
//        AddressTemplate mainAddress = new AddressTemplate("Słoneczna", 5, "23a", "90-501", "Warszawa");
//        AddressTemplate corespondenceAddress = new AddressTemplate("Letnia", 10, "2b", "90-502", "Poznań");
//        AddressTemplate vacationAddress = new AddressTemplate("Wesoła", 53, "3a", "20-501", "Lublin");
//
//        System.out.println(mainAddress.toString());
//        mainAddress.setCity("Zakopane");
//        System.out.println(mainAddress.getCityName());
//        System.out.println(corespondenceAddress.getCityName());
//        System.out.println(vacationAddress.getCityName());



    }
}

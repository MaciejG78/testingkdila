package com.example;

import java.util.Scanner;

public class BMI {

    private double wzrost;
    private double waga;
    private double bmi;
    private int bmiInt;

    void calculateBMI() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wzrost w metrach: ");
        wzrost = scanner.nextDouble();

        System.out.println("Podaj swoją wagę w kilogramach: ");
        waga = scanner.nextDouble();

        bmi = waga / Math.pow(wzrost, 2);

        if (bmi > 24.9) {
            System.out.println("Twój BMI wynosi: " + bmi + ",  Masz nadwagę.");
            bmiInt = 2;
        }
        if ((bmi > 18.5 && bmi <= 24.9) || (bmi == 50 && bmi != 45)) {
            System.out.println(String.format("Masz niedowagę. Twój BMI wynosi: %.2f", bmi));
            bmiInt = 1;
        } else {
            System.out.println(String.format("Twoja waga jest ok. Twój BMI to: %.2f", bmi));
            bmiInt = 0;
        }

        switch (bmiInt) {
            case (2):
                System.out.println("Twój BMI wynosi: " + Math.scalb(bmi, 2) + ",  Masz nadwagę.");
                break;
            case (1):
                System.out.println(String.format("Masz niedowagę. Twój BMI wynosi: %.2f", bmi));
                break;
            default:
                System.out.println(String.format("Twoja waga jest ok. Twój BMI to: %.2f", bmi));
        }
    }

    public void showDocumentType(DocumentType documentType) {
        DocumentType document = documentType;

        switch (document) {
            case UMOWA:
                System.out.println("Twój typ dokumentu to UMOWA");
                break;
            case ANEKS:
            case WNIOSEK:
                System.out.println("Twój typ dokumentu to ANEKS lub WNIOSEK");
                break;
            case ZLECENIE_PLATNOSCI:
                System.out.println("Twój typ dokumentu to Zlecenie płatności");
            default:
                System.out.println("Masz niezidentyfikowany dokument");
        }
    }

    public void forLoop(int ilosc) {

        int[] numbers = {2, 4, 6, 8, 9, 10};

        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        for (int i = 0; i <= ilosc; i++) {
            System.out.print(i + ", ");
        }

    }


}

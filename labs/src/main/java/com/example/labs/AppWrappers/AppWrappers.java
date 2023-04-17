package com.example.labs.AppWrappers;

//        Wrapper typowi podstawowemu (nie)równy?
//        Napisz program przypisujący jakieś wartości do zmiennych o typach podstawowych.
//        Następnie takie same wartości przypisz do typów, które będą wrapperami
//        dla typów podstawowych. Niech program porówna, czy wartości w typach
//        podstawowych oraz odpowiadających im wrapperach są sobie równe.
//        Do realizacji zadania wybierz trzy dowolne typy podstawowe.

public class AppWrappers {

    public static void main(String[] args) {

        Integer objectInteger = 5;
        int primitiveInteger = 5;

        double primitiveDouble = 2.22;
        Double objectDouble = 2.22;

        Long primitiveLong = 2L;
        Long objectLong = 2L;

        System.out.println("Compared primitive and objects Integers: " + (objectInteger == primitiveInteger));
        System.out.println("Compared primitive and objects Double: " + (objectDouble == primitiveDouble));
        System.out.println("Compared primitive and objects Long: " + (objectLong == primitiveLong));
    }
}

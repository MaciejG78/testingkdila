package com.example.labs.AppSrednia;

public class AppSrednia {

//    Napisz program obliczający wartość średnią 20 elementów tablicy.
//    Pamiętaj, że:elementy tablicy powinny być typu int,wynik prawdopodobnie nie będzie wartością całkowitą
//    ,pętla powinna wyświetlić wszystkie elementy tablicy,na koniec powinna zostać wyświetlona wartość średniej.


    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Long sum = 0L;

        for (int i =0; i < 20; i++) {
            sum += numbers[i]; //sum = sum + numbers[i];
//        i=0, sum = 0 + numbers[0] => 0 + 1 = 1
//        i=1, sum = 1 + numbers[1] => 1 + 2 = 3
//        i=2, sum = 3 + numbers[2] => 3 + 3 = 6
//        i = 19, sum = 190 + numbers[19] => 190 + 20 = 210
        }

        System.out.println("Suma: " + sum);
        System.out.println("Średnia dla 20 elementów wynosi: " + (double) sum/20);
    }

}

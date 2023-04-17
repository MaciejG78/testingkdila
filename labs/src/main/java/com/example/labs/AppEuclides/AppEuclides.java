package com.example.labs.AppEuclides;

import java.util.List;
import java.util.stream.Collectors;

public class AppEuclides {
    public static void main(String[] args) {
        Euclides euclides = new Euclides();
        System.out.println("-------- Sposób 1 z odejmowaniem ---------------------");
        int result1 = euclides.nwd1(48, 12);
        System.out.println("NWD for 48, 12: " + result1);
        int result2 = euclides.nwd1(9, 33);
        System.out.println("NWD for 9, 33: " + result2);
        int result3 = euclides.nwd1(162, 45);
        System.out.println("NWD for 162, 45: " + result3);

        System.out.println("\n-------- Sposób 2 z dzieleniem ---------------------");
        int result4 = euclides.nwd2(48, 12);
        System.out.println("NWD for 48, 12: " + result4);
        int result5 = euclides.nwd2(9, 33);
        System.out.println("NWD for 9, 33: " + result5);
        int result6 = euclides.nwd2(162, 45);
        System.out.println("NWD for 162, 45: " + result6);


//        List<String> names = List.of("Piotr", "Ala", "Zuzia", "Tadeusz");
//        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));

/*        for (int i=0; i< names.size(); i++) {
            System.out.println(names.get(i).length());
        }
 */
    }
}

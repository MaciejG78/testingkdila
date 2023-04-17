package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    Integer numberOfLimbs = 4;
    Boolean isWild;
    Boolean isFly = false;
    Boolean isSwimm = false;
    Colour colour = Colour.BLACK;
    String name;

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal ptak = new Animal(2, false, true, false, Colour.SILVER, "Karp Królewski");
        ptak.setIsSwimm(true);
    }
}

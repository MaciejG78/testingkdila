package com.example.labs.AppJoin;

import java.util.ArrayList;
import java.util.List;

public class AppJoin {


    public static void main(String[] args) {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for (int i = 0; i < companies.size(); i++) {
            if(i != (companies.size() - 1)) {
                System.out.print(companies.get(i) + ", ");
            } else {
                System.out.print(companies.get(i));
            }

        }

        System.out.println(String.join(", ", companies));
    }
}

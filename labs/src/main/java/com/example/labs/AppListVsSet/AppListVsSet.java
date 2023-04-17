package com.example.labs.AppListVsSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppListVsSet {

    public static void main(String[] args) {
        List<Integer> ordersList = new ArrayList<>();
        ordersList.add(1);
        ordersList.add(2);
        ordersList.add(3);
        ordersList.add(1);
        ordersList.add(3);

        System.out.println("ArrayList: " + ordersList);

        Set<Integer> ordersSet = new HashSet<>();
        ordersSet.add(1);
        ordersSet.add(2);
        ordersSet.add(3);
        ordersSet.add(1);
        ordersSet.add(3);

        System.out.println("HashSet: " + ordersSet);
    }
}

package com.example.stream.iterate;

import com.example.stream.immutable.ForumUserFinal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class NumbersGenerator {

    public static void generateEven(int max) {
        List<Integer> collect = Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);


        List<String> collectionNames = List.of("Tomek", "Ala", "Krystyna", "Zenobiusz", "Aneta", "Ola");

        collectionNames.stream().filter(name -> name.length() > 3)
                .forEach( n -> {
                    System.out.println(n);
                    System.out.println(n + " !!!");
                    System.out.println(n.substring(0, 1));
                });

        List<ForumUserFinal> forumUserList = List.of(new ForumUserFinal("Aneta", "Real Aneta"),
                new ForumUserFinal("Aneta2", "Real Aneta2"),
                new ForumUserFinal("Aneta3", "Real Aneta3"),
                new ForumUserFinal("Aneta4", "Real Aneta4"),
                new ForumUserFinal("Aneta5", "Real Aneta5"));

        forumUserList.stream()
                .filter( o -> o.getRealName().equals("Real Aneta") || o.getRealName().equals("Real Aneta4"))
                .forEach(System.out::println);
    }

}

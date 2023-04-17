package com.example.stream;

import com.example.stream.beautifier.PoemBeautifier;
import com.example.stream.forumuser.Forum;
import com.example.stream.forumuser.ForumUser;
import com.example.stream.immutable.ForumUserFinal;
import com.example.stream.iterate.NumbersGenerator;
import com.example.stream.lambda.ExpressionExecutor;
import com.example.stream.lambda.Processor;
import com.example.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 – Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text 2."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\n7.1. Upiększacz tekstów");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Ala ma kota", text -> text.toUpperCase());
        poemBeautifier.beautify("Ala ma kota", (text) -> text.toLowerCase());
        poemBeautifier.beautify("Ala ma kota", (text) -> "*** " + text + " ***");
        poemBeautifier.beautify("Ala ma kota", (text) -> "!!! " + text + " !!!");
        poemBeautifier.beautify("Ala ma kota", (text) -> "@@@ ".concat(text).concat(" @@@"));

        ForumUserFinal forumUserFinal = new ForumUserFinal("Ala", "Real Ala");
        forumUserFinal.getRealName();

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


        System.out.println("\n7.3. Poznanie funkcji stream(), filter(), map() i collect()");
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getForumUserList().stream()
                .filter(u -> u.getSex() == 'M')
                .filter(u -> Period.between(u.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(u -> u.getPostsCounter() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        resultMap.entrySet().stream()
                .map(map -> map.getKey() + ": " + map.getValue())
                .forEach(System.out::println);


    }
}

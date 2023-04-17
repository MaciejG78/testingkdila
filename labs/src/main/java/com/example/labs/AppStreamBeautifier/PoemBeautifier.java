package com.example.labs.AppStreamBeautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator) {
        System.out.println(text);
        System.out.println(poemDecorator.decorate());
    }
}

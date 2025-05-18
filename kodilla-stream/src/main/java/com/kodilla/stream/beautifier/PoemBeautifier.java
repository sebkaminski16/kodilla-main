package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String sToBeautify, PoemDecorator poemDecorator){
        String decorated = poemDecorator.decorate(sToBeautify);
        System.out.println(decorated);
    };
}

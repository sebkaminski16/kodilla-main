package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("mojadresemail", s -> s+ "@gmail.com");
        poemBeautifier.beautify("MALY TEKST", String::toLowerCase);
        poemBeautifier.beautify("Dzien dobry",  s -> s+"!!!!!!!");
        poemBeautifier.beautify("Jak sie masz",  s -> "¿"+s+"?");
        poemBeautifier.beautify("Otoczony tekst", s -> "------" + s + "-------");
    }
}
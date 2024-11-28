package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IntStream numbers =  IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);
    }
}
package org.example.Streams;
import java.util.stream.IntStream;

public class StreamsIdeasBasic {
    public static void idea0(){
        System.out.println("Hello world!");
        IntStream numbers =  IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);
    }
}

package org.example.Strings;

public class Java9Strings {
    public void test(){
        String text = "Hello";
        text.chars().forEach(System.out::println);//72 101 108 108 111
    }
    /*
    Compact Strings: Internal optimization using byte arrays for Latin-1 strings instead of char arrays
    String.chars(): Returns IntStream of character codes
    String.codePoints(): Returns IntStream of Unicode code points
    */
}

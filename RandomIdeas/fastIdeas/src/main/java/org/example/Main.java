package org.example;

public class Main {
    public static void main(String[] args) {
        //String -> any data type - Datatype.Parse
        //Data type-> String - String.valueOf

        //q1
        double price = 19.99;
        int dollars = (int) price;
        int age = 25;
        double precise = age;
        //q2
        String numberText= "42";
        int number = Integer.parseInt(numberText);
        String priceText = "19.99";
        double price = Double.parseDouble(priceText);

        String flagText = "true";
        boolean flag = Boolean.parseBoolean(flagText);

        //q3
        int score = 100;
        String scoreText = String.valueOf(score);
        double temperature = 98.6;
        String tempText = String.valueOf(temperature);
        boolean isReady = true;
        String readyText = String.valueOf(isReady);
        //4
        char letter = 'A';
        int ascii = letter;

        int asciiValue=66;
        char character = (char) asciiValue;
        //5
        int x = 7;
        int y = 2;
        double result = (double) x/y;

        String input1 = "123";
        String input2 = "45.67";
        String input3 = "false";

        int num1 = Integer.parseInt(input1);
        double num2 = Double.parseDouble(input2);
        boolean bool1 = Boolean.parseBoolean(input3);


        //double to int
        int test1 = (int) 3.13;
        //string to some data types
        Integer.parseInt("1");
        Double.parseDouble("1.0");
        Float.parseFloat("43");

        String.valueOf(3);
        //any datatype to String
        String test2 = String.valueOf(3);

//        for(int i = 0 ; i < 10; i++){
//
//            for (int j = 0; j  <  5 - i; j++){
//                System.out.print("#");
//            }
//            System.out.println("-");
//        }
//        //0 - 9
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }
//        //0 - 10
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("ii = " + i);
//        }

    }
}
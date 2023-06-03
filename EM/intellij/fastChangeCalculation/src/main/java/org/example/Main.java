package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDa
        Scanner scanner = new Scanner(System.in);
        int min = 50; // Minimum value of range
        int max = 100; // Maximum value of range
        int max2 = 200; // Maximum value of range
        // Print the min and max
        System.out.println("Random value in int from "+ min + " to " + max + ":");
        // Generate random int value from min to max
        int randomNumber2 = (int)Math.floor(Math.random() * (max - min + 1) + min);

        // Printing the generated random numbers

        int[] prices = new int[5];
        int[] pay = new int[5];
        for(int i = 0; i < prices.length; i++){
            int randomNumber1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            prices[i] = randomNumber1;
            pay[i] =  (int)Math.floor(Math.random() * (max2 - randomNumber1 + 1) + randomNumber1);
        }

        for(int i = 0; i < prices.length; i++){
            System.out.print((i+1)+" Price "+prices[i]+" Pay "+pay[i]);
            System.out.println();
        }
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//        Sub
//        Price $150 Pay $200 Change ?
//                Price $450 Pay $900 Change ?
//
//        Sum
//

    }
}
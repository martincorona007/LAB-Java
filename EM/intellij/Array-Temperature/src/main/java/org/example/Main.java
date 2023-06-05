package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");


        int numDays = console.nextInt();
        int[] temps = new int[numDays];
        int sum = 0;
        for (int i = 0; i < numDays;i++){
            System.out.print("Day "+i+"'s high temp: ");
            //int next = console.nextInt();
            temps[i] = console.nextInt();
            sum+=temps[i];
        }
        double average = sum / numDays;
        //count days above average
        int above =0;
        for(int i = 0; i < temps.length;i++){
            if(temps[i]>average){
                //System.out.println("= "+temps[i]);
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp "+average);
        System.out.println(above+" days above average");
    }
}
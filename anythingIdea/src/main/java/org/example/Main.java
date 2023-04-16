package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array1= new int[3];
        for(int i = 1 ; i < 2; i++){
            array1[i] = i*2;
        }
        for(int i = 1 ; i <= 2; i++){
            System.out.println("=? "+array1[i]);
        }

        System.out.println("Hello world!");
    }
}
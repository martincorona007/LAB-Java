package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] array1 = new int[4];
        int[] array2 = new int[]{1,2,3,4,5,6};
        int[] array3;
        array3 = new int[4];

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        int[][] array4 = new int[2][2];
        array4[0][0] = 1;
        array4[0][1] = 2;
        array4[1][0] = 3;
        array4[1][1] = 4;
        for (int i = 0; i < array4.length; i++) {
            System.out.println();
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array4[i][j]);
            }
        }
        //missing
        for (int it : array2){
            System.out.println(it);
        }
        i have a question i have  2d dimensional array can i use a enhanced for?
        for (int it,it2: array4){

        }

    }
}
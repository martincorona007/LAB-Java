package org.example.Arrays;

public class ArrayIdeasBasic {
    public static void idea0(){
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
        //i have a question i have  2d dimensional array can i use a enhanced for?
        // for (int it,it2: array4){

        // }
    }
    public static void MatrixAdditionExampleIn() {
        //creating two matrices
        int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
        //creating another matrix to store the sum of two matrice
        for (int x = 0; x < 3; x++) {
            System.out.println("  ");
            for (int y = 0; y < 3; y++) {
                System.out.print(" [" + a[x][y] + "] ");
            }
        }


        int c[][] = new int[3][3];//3 rows and 3 columns

        //adding and printing addition of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j]; //use - for subtrction
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }


}

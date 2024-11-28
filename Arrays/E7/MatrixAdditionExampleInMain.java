public class MatrixAdditionExampleInMain{
    public static void main(String[]args){
        //creating two matrices
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
        //creating another matrix to store the sum of two matrice
        for(int x = 0; x < 3; x++){
            System.out.println("  ");
            for(int y = 0; y < 3; y++){
                System.out.print(" ["+a[x][y]+"] ");
            }
        }
        
        
        
        int c[][] = new int[3][3];//3 rows and 3 columns

        //adding and printing addition of 2 matrices
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j]; //use - for subtrction
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
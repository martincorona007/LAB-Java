import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public final int dato = 0;
    public static int []daros;
    public String objs = "fs";
    //Problem Statement:

   // Write a function that will accept 2 parameters (an array of n integers and a number k) and determine whether there is a pair of elements in the array that sums to exactly k.  If there is a pair of elements that sum to equal the second parameter, the function should return true, otherwise, the function should return false.
   // Example 1: [1, 3, 7, 11] and k = 8, the function should return true.
  //  Example 2: [1, 3, 7, 11] and k = 6, the function should return false.
 //   Example 3: [1, 3, 7, 11] and k = 12, the function should return true.
    public boolean solutionIdea(int n,int[] arraysNumbers){
        int start = 0 ;
        int end = 0;
        boolean result = false;
        for(int i = 0; i< arraysNumbers.length;i++){
            for(int j = i; j < arraysNumbers.length;j++){
                start = arraysNumbers[i];
                if(j+1 >= arraysNumbers.length){
                    break;
                }
                end =  arraysNumbers[j+1];
                System.out.println("S "+start+"  e "+end);
                if(start + end == n){
                    return true;
                }else{
                    result = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arraysNumbers = new int[] {1,3,7,11};
        Main obj1 = new Main();
        System.out.println(obj1.solutionIdea(6,arraysNumbers));
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public final int dato = 0;
    public static void main(String[] args) {
        int[] obj = new int[5];
        int [] obj2 = new int[] { 1,2,3,4,5,5,6};
        int [] obj3 = new int[] { 1,2,3,4,5,5,6};

        if(obj2 == obj3){
            System.out.println("Yes");
        }else{
            System.out.println("Nel");
        }
        if(obj2.equals(obj3)){
            System.out.println("YEES");
        }else{
            System.out.println("no");
        }
        if(Arrays.equals(obj2,obj3)){
            System.out.println("YEES");
        }else{
            System.out.println("no");
        }
        for(int i = 0; i <= 4;i++){
            obj[i] = i;
        }
        for(int j = 0; j < obj.length;j++){
            System.out.println("> "+obj[j]);
        }



    }
}
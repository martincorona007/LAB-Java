package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class problems {
    public void reverseString0(char[] s) {
        System.out.println(s);
//            for (int i = s.length-1; i >= 0; i--) {
//                System.out.print(s[i]);
//            }
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        /*
        s = testing
        left
        right

        temp

        */
        System.out.println(s);
    }
    public void reverseString(char[] s) {
        for(int i = s.length -1 ; i >= 0 ;i--){
            System.out.print(s[i]);
        }
    }
    public void reverseString1(String w){
        for(int i = w.length() -1 ; i >= 0 ;i--){
            System.out.print(w.charAt(i));
        }
    }
    public static String reverseString2(String w){
        StringBuilder temporary = new StringBuilder();
        for(int i = w.length() -1 ; i >= 0 ;i--){
            temporary.append(w.charAt(i));
        }
        return temporary.toString();

    }

    public boolean isPalindromee(String s){
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1 ; i > 0 ; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println("Y"+sb.length());
        for(int i = 0 ; i < s.length() - 1; i++){
            if(sb.charAt(i) == s.charAt(i) ){
                //System.out.println(" "+i);
                if(i == s.length()-1){
                    System.out.println("Y"+i);
                    return true;
                }


            }
        }

        return false;
    }
    public static void main(String[] args) {
        problems obj = new problems();
//        char[] myChain = new char[] {'h','e','l','l','o'};

//        obj.reverseString(myChain);
//        String reverseWord = "Plata";
//        System.out.println("");
//        obj.reverseString1(reverseWord);
//        System.out.println("");
//        System.out.println(reverseString2(reverseWord));

        String palindrome1 = "madam";
        /*
        m a d a m
        0 1 2 3 4
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("length "+palindrome1.length());
        String palindrome2 = "A man a plan a canal Panama";
        System.out.println(obj.isPalindromee(palindrome1));


        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer,Character> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, palindrome1.charAt(i));
            System.out.println("=> "+hashMap.get(i));
        }

        ArrayList<Character> al1 = new ArrayList<>();
        al1.add('a');
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);

        // java.util.stream.IntStream.


    }
}

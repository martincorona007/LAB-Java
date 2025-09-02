package org.example.Strings;

public class StringsIdeasBasic {
    public static void stringMethods(){
        String testIdea1 = "I am going to the park ";
        System.out.println(""+testIdea1.toUpperCase());
        System.out.println(""+testIdea1.trim());
        System.out.println(""+testIdea1.toLowerCase());
        System.out.println(""+testIdea1.contains(""));

    }
    public static void reverse(){
        String nomalString = "Hello Future I'm Back";
        System.out.println("normal String "+nomalString);
        String r = reverseString(nomalString);
        System.out.println("reverseString "+r);
    }
    public static String reverseString(String s){
        String newString = "";
        for(int i = s.length()-1; i >= 0;i --){
            //System.out.print("-> "+s.charAt(i));
            newString += s.charAt(i);
        }
        return newString;
        //char[] letters = new char[s.length()];
        // int letterIndex = 0;
        // for(int i = s.length() - 1 ; i >= 0; i--){
        //     System.out.println("OUT "+s.charAt(i));
        //     letters[letterIndex] = s.charAt(i);
        //     letterIndex++;
        //     System.out.print("=> "+letters[i]);
        // }
        // String reverse = "";
        // for(int i = 0; i < s.length(); i++){
        //     reverse = letters[i]; error char to String
        //     reverse +=  letters[i];
        // }
        //return reverse;
    }
    public static void duplicates(){
        String sentence = "How many duplicates are there?";
        System.out.println(sentence);
        String characters = "";
        String duplicates = "";
        for(int i = 0; i < sentence.length(); i++){
            String current = Character.toString(sentence.charAt(i));
            if(characters.contains(current)){
                //duplicates += current;
                if(!duplicates.contains(current)){//avoid repeated letters
                    duplicates += current;
                    //  System.out.println("you "+duplicates);
                }
                //System.out.println("yous "+duplicates);
            }
            characters += current;
            //System.out.println(characters);
        }
        System.out.println(duplicates);
    }

}

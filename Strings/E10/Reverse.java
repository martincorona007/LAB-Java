public class Reverse{
    public static void main(String[] args){
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
}
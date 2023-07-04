public class Duplicates{
    public static void main(String []args){
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
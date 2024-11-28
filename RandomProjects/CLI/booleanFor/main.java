public class Main{
  public static void main(String[] args){
    boolean sentence;
      sentence = true;
      for(int i = 0;sentence;i++){
        if(i == 4){
          sentence = false;
          System.out.println("if");
        }
        System.out.println("for");
      }
  }
}
public class main{
  public static void main(String[]args){
    String bar = new String("abc");

      String foo = "abc";

     

      System.out.println(bar == foo);

     

      if(foo.equals(bar)){

        System.out.println("Hello, World!"); 

      }else{

        System.out.println("H!");

      }

     

      String s1 = "Hello";

      String s2 = "Hello";

      String s3 = new String("Hi");

      String s4 = "Hi";

      System.out.println("s1 == s2? " + (s1 == s2));

      System.out.println("s3 == s4? " + (s3 == s4));

      s3 = s3.intern();

      System.out.println("s3 == s4? " + (s3 == s4));
  }
}
public class main{
    public static void main(String[] args){
        int dec = 152;
        int bin = 0b10011000;
        int oct = 0230;
        int hex = 0x98;
        System.out.println(dec);
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);
        int a = 0;
        int b = 0; 
        
        System.out.println("[Pre-increment a ]");
        ++a;
        System.out.println("> "+a);
        System.out.println("Post-increment b ");
        b++;
        System.out.println("> "+b);
        System.out.println("[Post-increment a ]");
        a++;
        System.out.println("> "+a);
        System.out.println("Pre-increment b ");
        ++b;
        System.out.println("> "+b);
        System.out.println("Random Ideas ");
        int c = 1;
        c++; 
        int d = 1;
        d+=1;
        int e = 1; 
        e=e+1; 
        int f = 1;
        f-=-1;
        System.out.println("> c "+c+" d "+d+" e "+e+" f "+f);
        System.out.println("============================");
        int i, j;
        // post-increment example
        i = 0;
        j = i++; 
        System.out.println("The value of j (i++): " + j);
        System.out.println("The value of i (i++): " + i);
        // pre-increment example
        i = 0;
        j = ++i; 
        System.out.println("The value of j (++i): " + j);
        System.out.println("The value of i (++i): " + i);
        /*for(int i = 0; i<10 ; i++){
            System.out.println(" "+i);
        }*/
        boolean sentence;
    sentence = true;
    for(int jo = 0;sentence ;jo++){
        System.out.println("N "+jo);
      if(jo == 4){
        sentence = false;
      }
    }
    }
}
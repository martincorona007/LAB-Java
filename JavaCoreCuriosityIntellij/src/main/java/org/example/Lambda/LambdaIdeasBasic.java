package org.example.Lambda;

public class LambdaIdeasBasic {
    public static void idea1(){
        byte var1 = 10;
        Drawable var2 = () -> {
            System.out.println("Drawing " + var1);
        };
        var2.draw();
    }
}

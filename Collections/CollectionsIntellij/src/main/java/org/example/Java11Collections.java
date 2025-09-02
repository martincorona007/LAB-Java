package org.example;

import java.util.ArrayList;
import java.util.List;

public class Java11Collections {
    private ArrayList<Integer> lista;
    public Java11Collections(int lenght){
        lista = new ArrayList<>(lenght);
    }
    public void immutableListExample(){
        List<String> colores = List.of("blue","white","black");
        System.out.println("colores "+colores);
        try{
            colores.add("green");
        }catch (UnsupportedOperationException e){
            System.out.println("error "+e.getMessage());
        }

    }

}

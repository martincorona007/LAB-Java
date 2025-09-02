package org.example.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java11Collections {
    private ArrayList<Integer> lista;
    public Java11Collections(int lenght){
        lista = new ArrayList<>(lenght);
    }
    ///
    ///
    /// Factory methods Java 9 (2017):
    ///
    ///
    public void immutableListExample(){
        List<String> colores = List.of("blue","white","black");
        System.out.println("colores "+colores);
        try{
            colores.add("green");
        }catch (UnsupportedOperationException e){
            System.out.println("error "+e.getMessage());
        }

    }
    public void immutableSetExample(){
        Set<Integer> numbers = Set.of(1,2,3,4,5,6);
        System.out.println("numbers "+numbers);

        try{
            numbers.add(2);
        }catch (UnsupportedOperationException e){
            System.out.println("error "+e.getMessage());
        }
    }
    public void immutableMapExample(){
        Map<Integer,String> players = Map.of(1,"Di maria",2,"Messi",3,"cristiano");
        System.out.println("mapa "+players);
        try{
            players.put(3,"maradonio");
        }catch (UnsupportedOperationException e){
            System.out.println("error "+e.getMessage());
        }
    }

}

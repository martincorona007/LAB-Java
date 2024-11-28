package org.example.collections.exampleMap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class testMain {
    public static void main(String[] args) {
        Map<Integer,String> lista = new HashMap<>();
        lista.put(1,"Audi");
        lista.put(2,"Lamborghini");
        lista.put(3,"Mercedez");
        lista.put(4,"Bently");
        lista.put(5,"Jaguar");
        Iterator itr = lista.entrySet().iterator();

        while (itr.hasNext()){
            System.out.println("--> "+itr.next());
        }
        itr.forEachRemaining(o -> System.out.println(o));
        //Iterator
        //Iterable

    }
}

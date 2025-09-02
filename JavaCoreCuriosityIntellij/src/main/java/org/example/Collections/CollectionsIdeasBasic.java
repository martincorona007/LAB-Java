package org.example.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
public class CollectionsIdeasBasic {
    public static void idea1(){
        Map<String,String> listMovies = new HashMap<>();
        listMovies.put("Daniel Craig", "No Time To Die");
        listMovies.put("Joaquin Phoenix", "Joker");
        listMovies.put("Arnold Schwarznegger", "Terminator");
        listMovies.put("Marlin Brando", "The Godfather");
        listMovies.put("Charlie Chaplin", "City Lights");
        listMovies.put("Luke Skywalker", "Star Wars");
        listMovies.put("Bruce Willis", "Die Hard");
        listMovies.put("Sylvester Stallone", "Rocky");
        listMovies.put("Matthew McConaughey", "Interstellar");
        listMovies.put("Russell Crowe", "Gladiator");

        Map<Integer,String> listNumbers = new HashMap<>();
        listNumbers.put(1,"abcs");
        listNumbers.put(2,"abcs");
        listNumbers.put(3,"abcs");
        listNumbers.put(4,"abcs");
        listNumbers.put(5,"abcs");

        String value1 = listNumbers.getOrDefault(1, "Not Found");
        System.out.println("=>> "+value1);
        String valu2 = listNumbers.getOrDefault(6,"Not Found");
        System.out.println("->> "+valu2);
        for (int i = 1; i <=10; i++) {
            String valu3 = listNumbers.getOrDefault(i,"Not Found");
            System.out.println("->>> "+valu3);
        }


//System.out.println(listMovies.entrySet());
        //Java 8 forEach loop lambdas
        listMovies.forEach((e,v)-> System.out.println(" "+e+" - "+v));
        System.out.println("========================================");
        //Java 8 Stream API
        listMovies.entrySet().stream().forEach(e-> System.out.println("K "+e.getKey()+" , V "+e.getValue()));
        System.out.println("========================================");
        //Java 8 Stream API Parrallel
        listMovies.entrySet().stream().parallel().forEach(e-> System.out.println("Actor "+e.getKey()+" , Movie "+e.getValue()));

        //Map.entrySet and forEach
        for(String llave : listMovies.keySet()){
            System.out.println("["+llave+"]");
        }
        System.out.println("========================================");
        Iterator<String> movies = listMovies.keySet().iterator();
        while (movies.hasNext()){
            String name = movies.next();
            System.out.println("K "+name+" "+listMovies.get(name));
        }
        //        System.out.println("========================================");
//        //Map.entrySet and forEach
//        for(Map.Entry<String,String> item: listMovies.entrySet()){
//            System.out.println("["+item.getKey()+","+item.getValue()+"]");
//        }
//        System.out.println("========================================");
//        //Map.entrySet and iterator
//        Iterator<Map.Entry<String, String>> moviesEntryIterator =listMovies.entrySet().iterator();
//        while (moviesEntryIterator.hasNext()){
//
//            Map.Entry<String,String> moviesPair = moviesEntryIterator.next();
//            System.out.println("<"+moviesPair.getKey()+" , "+moviesPair.getValue()+">");
//        }
//        System.out.println("========================================");

//        for(String val : listMovies.values()){
//            System.out.println("<"+val+">");
//        }
    }
    public static void idea0(){
        List<String> list = new ArrayList<>();
        List<Integer> core= new LinkedList<>();

        list.add("d");
        System.out.println(list);
        // Map<Integer,String> lista = new HashMap<>();
        // lista.put(1,"Audi");
        // lista.put(2,"Lamborghini");
        // lista.put(3,"Mercedez");
        // lista.put(4,"Bently");
        // lista.put(5,"Jaguar");
        // Iterator itr = lista.entrySet().iterator();

        // while (itr.hasNext()){
        //     System.out.println("--> "+itr.next());
        // }
        // itr.forEachRemaining(o -> System.out.println(o));
        // //Iterator
        // //Iterable

    }
}

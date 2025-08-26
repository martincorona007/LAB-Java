package org.example;

import java.util.ArrayList;

public class Java5Collections {

    //This is Java 5
    //DCRUD
    //Define Create Read Update Delete
    //====DEFINE
    private ArrayList dynamicListJava5;
    public Java5Collections(int size){

        dynamicListJava5 = new ArrayList(size);
    }
    //====CREATE
    public void Java5CollectionsCreate(){
        for (int i = 1; i <= 5; i++) {
            dynamicListJava5.add(i);
        }
    }
    //====READ
    public void Java5CollectionsReadV1(){
        for (int i = 0; i <dynamicListJava5.size(); i++) {
            System.out.println("V1 "+i+" = " + dynamicListJava5.get(i));
        }
    }
    public void Java5CollectionsReadV2(){
        for (Object it:dynamicListJava5) {
            System.out.println("V2 i = " + it);
        }
    }
    //====UPDATE
    public void Java5CollectionsUpdate(){
        dynamicListJava5.set(3,9);
        System.out.print("Update");

    }
    //====DELETE
    public void Java5CollectionsDelete(){
        dynamicListJava5.remove(3);
     }


}

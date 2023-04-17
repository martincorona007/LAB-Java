package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){


          DbOperations operations = new DbOperations();
          try {
                ResultSet resultSet = operations.getAllStundets();
                while (resultSet.next()){
                    System.out.println(resultSet.getInt("id")+" "+resultSet.getString("student_name")+" "+resultSet.getFloat("score")+" "+resultSet.getString("subject_id"));
                }
//                operations.getStudentId(6).forEach( s -> System.out.print(s+" "));

//              System.out.println(operations.insertStudent("Martin",49,"Subject 10"));

//              ResultSet resultSet = operations.getAllSubjects();
//              while (resultSet.next()){
//                  System.out.println(resultSet.getInt("id") +" "+ resultSet.getString("name"));
//
//              }

//              operations.getSubjectById(5).forEach(e -> System.out.print(e+" "));

//              for(int i = 0; i < 16; i++){
//
//                  System.out.println(operations.insertSubject("Subject "+i));
//              }
          }catch (Exception e){
              System.out.println("Exeption :D "+e);
          }


//        RunningScripts op = new RunningScripts();
//        try {
//            op.runDbScript();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
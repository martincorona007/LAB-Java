package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        DbOperations operations = new DbOperations();
        operations.getStudentId(4).forEach(e-> System.out.print(e+" "));

//        ResultSet resultSet = operations.getAllStundets();
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getFloat(3)+" "+resultSet.getInt(4));
//        }


        //operations.getSubjectById(2).forEach(e -> System.out.print(e+" "));


        //System.out.println(operations.insertSubject("Nurse"));

       // System.out.println(operations.insertStudent("Rash",5,"Science"));

        //System.out.println(operations.insertStudent("Brank"));

//        ResultSet resultSet = operations.getAllSubjects();
//        while (resultSet.next()){
//            String name = resultSet.getString("name");
//            System.out.println("=> "+name);
//        }

    }
}
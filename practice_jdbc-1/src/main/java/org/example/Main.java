package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        DbOperations operations = new DbOperations();

        //System.out.println(operations.insertSubject("Phone"));

        ResultSet resultSet = operations.getAllSubjects();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            System.out.println("=> "+name);
        }

    }
}
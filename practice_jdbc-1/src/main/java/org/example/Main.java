package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        DbOperations operations = new DbOperations();

        //System.out.println(operations.insertSubject("Phone"));
        System.out.println(operations.getAllSubjects());

    }
}
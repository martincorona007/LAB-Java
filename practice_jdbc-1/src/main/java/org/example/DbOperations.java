package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbOperations {
    Connection con;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    public DbOperations(){
        con = DbUtil.getConnection();
    }
    //CREATE
    public boolean insertSubject(String name) throws SQLException{
        String sql_query = "INSERT INTO Subject(name)";
        sql_query+="VALUES(?)";
        preparedStatement = con.prepareStatement(sql_query);
        preparedStatement.setString(1,name);
        int result = preparedStatement.executeUpdate();
        if(result == 1){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList getSubjectById(int id) throws SQLException{
        return null;
    }
    public ResultSet getAllSubjects() throws SQLException{
        String sql_query = "SELECT * FROM Subject";
        preparedStatement = con.prepareStatement(sql_query);
        return resultSet = preparedStatement.executeQuery();
    }

    public boolean insertStudent(String student_name, float score, String name) throws SQLException{
        String sql_query = "INSERT INTO Student(student_name,score,subject_id)";
        sql_query += "VALUES (?,?,?)";
        String sql_query2 = "SELECT * FROM Subject WHERE name = ?";
        int i = 0;
        preparedStatement = con.prepareStatement(sql_query2);
        preparedStatement.setString(1,name);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            i = resultSet.getInt("id");
        }
        preparedStatement = con.prepareStatement(sql_query);
        preparedStatement.setString(1,student_name);
        preparedStatement.setFloat(2,score);
        System.out.println("pre "+preparedStatement);
        preparedStatement.setInt(3,i);
        System.out.println("pre "+preparedStatement);
        int result = preparedStatement.executeUpdate();

        if(result != 1){
            return false;
        }else{
            return true;
        }
    }

    public ArrayList getStudentId(int id) throws  SQLException{
        return null;
    }
    public ResultSet getAllStundets() throws SQLException{
        return  null;
    }

}

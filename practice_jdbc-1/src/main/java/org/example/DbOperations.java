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

        return false;
    }
    public ArrayList getStudentId(int id) throws  SQLException{
        return null;
    }
    public ResultSet getAllStundets() throws SQLException{
        return  null;
    }
}

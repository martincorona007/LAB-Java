package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbOperations {
    Connection con;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    public DbOperations(){
        con = DbUtil.getConnection();
    }

    public boolean insertSubject(String name) throws SQLException{
        String query_sql = "INSERT INTO Subject(name) VALUES(?)";
        preparedStatement = con.prepareStatement(query_sql);
        preparedStatement.setString(1,name);
        int result  = preparedStatement.executeUpdate();
        if(result!=1){
            return  false;
        }else{
            return true;
        }
    }
    public ArrayList getSubjectById(int id) throws SQLException{
        String query_sql = "SELECT * FROM Subject WHERE id = ?";
        ArrayList lista = new ArrayList();
        preparedStatement = con.prepareStatement(query_sql);
        preparedStatement.setInt(1,id);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            lista.add(resultSet.getInt("id"));
            lista.add(resultSet.getString("name"));
        }
        return lista;
    }
    public ResultSet getAllSubjects() throws SQLException{
        String query_sql = "SELECT * FROM Subject";
        preparedStatement = con.prepareStatement(query_sql);
        resultSet = preparedStatement.executeQuery();
        return resultSet;
    }
    public boolean insertStudent(String student_name, float score, String name) throws SQLException{
        String query_sql = "SELECT * FROM Subject WHERE name = ?";
        int id_student = 0;
        preparedStatement = con.prepareStatement(query_sql);
        preparedStatement.setString(1,name);
        ResultSet resultSet1 = preparedStatement.executeQuery();
        System.out.println("p2 "+preparedStatement);
        while(resultSet1.next()){
            id_student = resultSet1.getInt("id");
        }

        String query_sql2 = "INSERT INTO Student(student_name,score,subject_id) VALUES(?,?,?)";
        preparedStatement = con.prepareStatement(query_sql2);
        preparedStatement.setString(1,student_name);
        preparedStatement.setFloat(2,score);
        preparedStatement.setInt(3,id_student);
        System.out.println("p1 "+preparedStatement);
        int result = preparedStatement.executeUpdate();
        if(result != 1){
            return false;
        }else{
            return true;
        }

    }
    public ArrayList getStudentId(int id) throws  SQLException{
        String query_sql = "SELECT * FROM Student WHERE id = ?";
        ArrayList lista = new ArrayList<>();
        preparedStatement = con.prepareStatement(query_sql);
        preparedStatement.setInt(1,id);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            lista.add(resultSet.getInt("id"));
            lista.add(resultSet.getString("student_name"));
            lista.add(resultSet.getFloat("score"));
            lista.add(resultSet.getInt("id"));
        }
        return lista;
    }
    public ResultSet getAllStundets() throws SQLException{
        String query_sql = "SELECT * FROM Student";
        preparedStatement = con.prepareStatement(query_sql);
        return  preparedStatement.executeQuery();

    }
}

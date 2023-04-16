package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbOperations {
    Connection con;
    public DbOperations(){
        con = DbUtil.getConnection();
    }

    public boolean insertSubject(String name) throws SQLException{
    return false;
    }
    public ArrayList getSubjectById(int id) throws SQLException{
        return null;
    }
    public ResultSet getAllSubjects() throws SQLException{
        return null;
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

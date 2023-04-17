package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;

public class RunningScripts {
    Connection con;
    String line = null;
    RunningScripts(){
        con = DbUtil.getConnection();
    }
    public void runDbScript() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("db.sql"));
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine())!= null){
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        reader.close();
        String sql = stringBuilder.toString();
        Statement statement = con.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Tables created sucessfully");
        con.close();
    }
}

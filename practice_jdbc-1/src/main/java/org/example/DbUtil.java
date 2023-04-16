package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
    private static String DB_URL = "jdbc:mysql://localhost:3306/testing";
    private static String USERNAME ="root";
    private static String PASSWORD = "12345";
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            if(con!= null){
                System.out.println("Conexion OK");
            }
        }catch (Exception e){
            System.out.println("Conexion No ");
            System.out.println(e);
        }
        return con;
    }
    public static void closeConnection(Connection con){
        try {
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

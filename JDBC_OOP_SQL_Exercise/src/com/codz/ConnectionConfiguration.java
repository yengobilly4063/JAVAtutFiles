package com.codz;
import java.sql.*;

public class ConnectionConfiguration {
    private static String url = "jdbc:mysql://localhost:3306?";
    private static String user = "root";
    private static  String pass = "";
    private static Connection con = null;
    private static Statement st = null;
    private static ResultSet rs = null;

    public ConnectionConfiguration(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver installed");
            this.con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established");
        }catch (Exception e){
            System.out.println("Connection Not Established");
            System.out.println(e);
        }
    }

    public static Connection getCon() {
        return con;
    }
}

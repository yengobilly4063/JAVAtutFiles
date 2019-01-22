package com.codz;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {

    //JDBC DRIVER NAME AND DATABASE
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";

    //Database Credentials
    private static final String USER = "root";
    private static final String PASS = "";


    public static Connection getConnection(){
        Connection con = null;

        try{
            //Step 2 : Register the JDBC DRIVER
            Class.forName(JDBC_DRIVER);

            //Step 3: Open a connection.
            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection established");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Connection NOT established");
        }

        return con;
    }

    public static void createDatabase(){

        String db_check = "CREATE DATABASE IF NOT EXISTS extracts;";
        String use_db = "USE extracts";
        String tb_check = "CREATE TABLE IF NOT EXISTS employee ( empID int AUTO_INCREMENT, empName varchar(255), empAddres varchar(255), PRIMARY KEY (empID));";
        String emp_populat = "INSERT INTO employee (empName, empAddres) VALUES (\"Yengo Bill\", \"E. Vilde tee\")";

    }

}

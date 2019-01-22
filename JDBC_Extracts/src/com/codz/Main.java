package com.codz;

//Step 1 : Import JDBC Driver
import java.sql.*;
import java.util.Scanner;

public class Main {

    private static Scanner scan  = new Scanner(System.in);

    //JDBC DRIVER NAME AND DATABASE
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";

    //Database Credentials
    private static final String USER = "root";
    private static final String PASS = "";

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            con = new DB_Connection().getConnection();
            try{
                if (con != null){
                    //Step 4 : Execute query
                    System.out.println("Creating statement...");
                    stmt = con.createStatement();
                    System.out.println("Statement created");

                    //Setting database auto-update to false
                    con.setAutoCommit(false);

                    //DB Queries
                    String db_check = "CREATE DATABASE IF NOT EXISTS extracts;";
                    String use_db = "USE extracts";
                    String tb_check = "CREATE TABLE IF NOT EXISTS employee ( empID int AUTO_INCREMENT, empName varchar(255), empAddres varchar(255), PRIMARY KEY (empID));";
                    String emp_populat = "INSERT INTO employee (empName, empAddres) VALUES (\"Yengo Bill\", \"E. Vilde tee\")";
                    stmt.addBatch(db_check);
                    stmt.addBatch(use_db);
                    stmt.addBatch(tb_check);

                    //Execute batchQueries and commit to database.
                    stmt.executeBatch();
                    System.out.println("Database and table created");

                    //Commit changes to database.
                    con.commit();

                }
            }catch (Exception se){
                se.printStackTrace();
                System.out.println("Statement not made or database not found");
            }



        }catch ( Exception e){
            e.printStackTrace();
            System.out.println("Connection NOT established!!");
        }

        System.out.println("Exiting ..");
    }

    public static void createDatabase( Statement stmt){
        System.out.print("Enter Database/Company name : ");
        String db_name = scan.nextLine();
        String db_check = "CREATE DATABASE IF NOT EXISTS " + db_name;
        String use_db = "USE " + db_name;
        System.out.println("Employee table created ... for company " + db_name);

        String tb_check = "CREATE TABLE IF NOT EXISTS Employee( empID int AUTO_INCREMENT, empName varchar(255), empAddres varchar(255), PRIMARY KEY (empID));";

        System.out.print("Enter Employee name ");
        String empName = scan.nextLine();
        System.out.print("Enter Employee Address ");
        String empAddress = scan.nextLine();

        String emp_populat = "INSERT INTO Employee ( EmpName, EmpAddress) VALUES ( " + empName + "," + empAddress + ")";

    }

}

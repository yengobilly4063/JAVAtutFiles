package com.codz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Connectivity Procedure
//1. import package             -->java.sql.*
//2. Load & Register the Driver -->com.mysql.jdbc.Driver
//3. Create Connection.         -->Connection
//4. Create a statement         -->Statement
//5. execute the Query.
//6. Process the results
//7. Close the statement and conncetion

public class Main {

    public static void main(String[] args) throws Exception {




        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3307/shopdb";
            String user = "root";
            String pass = "";
            String query = "SELECT CustomerName FROM Customers WHERE CustomerID=1";


            Connection con = DriverManager.getConnection("URL", "user", "pass");
            System.out.println("Connection established");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            System.out.println(name);
            st.close();
            con.close();

        }catch (Exception e ){
            e.printStackTrace();
        }




//



    }
}

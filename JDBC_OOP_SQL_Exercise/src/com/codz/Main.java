package com.codz;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs = null;
//        connectionConfig();
//        Connection con = null;
        try{
            ConnectionConfiguration connect = new ConnectionConfiguration();
            con = connect.getCon();
            if ( con != null ){
                Statement st = null;
                try{
                    st = con.createStatement();
                    if (st != null){
                        con.setAutoCommit(false);
                        st.addBatch("CREATE DATABASE IF NOT EXISTS newdb");
                        st.addBatch("USE newdb");
                        st.addBatch("CREATE TABLE IF NOT EXISTS newtable(id int PRIMARY KEY AUTO_INCREMENT, name varchar(50), age int)");
                        st.executeBatch();
                        System.out.println("Database and table created");
                    }
                }catch (Exception e){
                    System.out.println("Statement not created");
                    System.out.println(e);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }


}




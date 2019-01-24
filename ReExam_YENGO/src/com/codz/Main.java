package com.codz;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String QUERY_DB = "SELECT help_category_id, name, parent_category_id FROM help_category where ((char_length(name)) > 7);";

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;


        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Drivers registered !");
            System.out.println("Establishing connection...");
            con = DriverManager.getConnection(URL, USER, PASS);

            if (con != null){
                System.out.println("Connection Established !");
                try{
                    st = con.createStatement();
                    if ( (st != null) ){
                        st.executeQuery(QUERY_DB);
                        rs = st.getResultSet();
                        System.out.println("help_category_id\tname\tparent_category_id");
                        while (rs.next()){
                            int help_category_id = rs.getInt("help_category_id");
                            String name = rs.getString("name");
                            int parent_category_id = rs.getInt("parent_category_id");

                            System.out.print(help_category_id + ",\t" + name + ",\t" + parent_category_id + "\n");
                        }
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                    System.out.println("\nData not found");
                }finally {
                    if ( rs != null ){
                        try{
                            rs.close();
                        }catch (Exception eRs){ }
                        rs = null;
                    }
                    if ( st != null ){
                        try{
                            st.close();
                        }catch (Exception eCon){ }
                        st = null;
                    }
                }
            }

        }catch (Exception ex){
            System.out.println("\nNO connetion found to database");
        }finally {
            //Close connection to database if established in the first place.
            if ( con != null ){
                try{
                    con.close();
                }catch (Exception eCon){ }
                con = null;
            }
        }

    }
}
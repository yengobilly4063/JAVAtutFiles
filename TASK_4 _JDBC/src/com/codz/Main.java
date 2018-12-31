package com.codz;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        final String verifyDB = "DROP DATABASE IF EXISTS ExamPrep";
        final String creatDB = "CREATE DATABASE ExamPrep";
        final String useDB = "USE ExamPrep";
        final String createTable = "CREATE TABLE Test(Description TEXT NOT NULL)";
//        final String useDBExamPrep = "USE ExamPrep";
        final String insertDB = "INSERT INTO Test(Description) VALUES(\"It works\")";



        try{
            System.out.println("Registering drivers...");
            Class.forName("com.mysql.cj.jdbc.Driver"); //This will register the DriverManager
            System.out.println("Drivers registered !");
            System.out.println("Establishing connection...");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShopDB?" + "user=root&password=");

            if (con != null){
                System.out.println("Connection Established !");
                try{
                    //Create a statement on the connection to the database
                    st = con.createStatement();

                    if ( (st != null) ){
                        //Prevent Database from auto Commit/Update unless told to.
                        con.setAutoCommit(false);

                        //ADD statements to batch
                        System.out.println("Creating database..");
                        System.out.println("Creating table..");
                        st.addBatch(verifyDB);
                        st.addBatch(creatDB);
                        st.addBatch(useDB);
                        st.addBatch(createTable);
                        st.addBatch(useDB);
                        //INSERT DATA
                        st.addBatch(insertDB);
                        st.executeBatch();

                        //Commit changes to database
                        con.commit();

                        System.out.println("Database created! ");
                        System.out.println("Table created...");

                        //RETRIEVE DATA FROM TABLE
                        rs = st.executeQuery("SELECT Description FROM Test");
                        while (rs.next()){
                            String Description = rs.getString("Description");
                            System.out.println("\nRESULTS");
                            System.out.println("Desctiption : " + Description);
                        }


                    }

                }catch(Exception e){

                    System.out.println("\nData not found");
                    System.out.println("SQLException: " + e.getMessage());
                }finally {
                    if ( rs != null ){
                        try{
                            rs.close();
                        }catch (Exception eRs){ }  //No possible exception really. Just need to close the try statement
                        rs = null;
                    }
                    if ( st != null ){
                        try{
                            st.close();
                        }catch (Exception eCon){ }  //No possible exception really. Just need to close the try statement
                        st = null;
                    }
                }
            }

        }catch (Exception ex){
            System.out.println("\nNO connetion found to database");
            System.out.println("SQLExeption: " + ex.getMessage());
        }finally {
            //Close connection to database if established in the first place.
            if ( con != null ){
                try{
                    con.close();
                }catch (Exception eCon){ }  //No possible exception really. Just need to close the try statement
                con = null;
            }
        }

    }
}

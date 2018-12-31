package com.codz;
import java.sql.*;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

public class Main {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        final String getAllCustomers = "SELECT * FROM Customers";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //This will register the DriverManager
            System.out.println("State 1 arrived");

            //Now we establish the connection with the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShopDB?" + "user=root&password=");

            if (con != null){
                //Return this line if connection with the databae was established successfully
                System.out.println("Connection Established");
                try{
                    //Create a statement on the connection to the database
                    st = con.createStatement();

                    //Now use that statement to run a query to the database (SELECT, UPDATE, DELATE etc..)
                    //Store the results in a Result Set(ResultSet) table
                    rs = st.executeQuery(getAllCustomers);

                    //Data for Query results is now stored in <<rs>>
                    //We need now to find a way to display this result
                    if ( (st != null) && (st != null) ){
                        System.out.println("\nState 2 arrived");
                        System.out.println("Statement was made from connection");
                        System.out.println("Retrieving data ...");
                        System.out.println("Data retrieved successfully\n");
                        System.out.println("Printing data ...");
                        int count = 1;
                        System.out.println("'CustID', CustomerName, ContactName, Address, PostalCode, Country");
                        while(rs.next()){ //First Row contains the headers, which is not relevant info
                                            //So we move to the second row and use rs.next() to keep moving down till the end
                            //Collect each column based on its data type
                            String CustomerName = rs.getString("CustomerName");
                            String ContactName = rs.getString("ContactName");
                            String Address = rs.getString("Address");
                            String PostalCode = rs.getString("PostalCode");
                            String Country = rs.getString("Country");
                            System.out.println("\t" + count + ",\t\t" + CustomerName + ",  " + ContactName + ",  " + Address + "," + PostalCode + "," + Country );
                            count++;


                        }
                    }

                }catch(Exception e){
                    //This error will only be executed if access connection to database was established,
                    //but no data was retrieved from the database
                    //Hence, review SQL statement
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

package com.imoving.UI.DataBaseConnection;
import java.sql.*;

public class DataBaseConnection {
    public void database(){
        //JDBC driver name and database url
        final String JDBC_Driver = "com.mysql.jdc.Driver";
        final String DB_URL = "jdbc:mysql://13.233.35.41:3306/opentaps";

        //Database credentials
        final String user = "dbuser";
        final String pass = "test@123";

        Connection conn = null;
        Statement stmt = null;

        try{
            //Register JDBC driver
            Class.forName(JDBC_Driver);

            //Open Connection
            try {
                conn = DriverManager.getConnection(DB_URL, user, pass);

                //Execute a Query
                stmt = conn.createStatement();
                String sql = "Select * from opentaps where id = xxxx";
                ResultSet executeQuery = stmt.executeQuery(sql);

                //Extract data from result set
                while(executeQuery.next()){
                    String fName = executeQuery.getString("First_Name");
                    String lName = executeQuery.getString("Last_Name");

                    System.out.println(fName+" "+lName);
                }

                //Close all connection
                executeQuery.close();
                stmt.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }catch (ClassNotFoundException e ){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

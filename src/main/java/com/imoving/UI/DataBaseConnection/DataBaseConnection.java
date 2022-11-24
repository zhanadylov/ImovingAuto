package com.imoving.UI.DataBaseConnection;

import com.imoving.UI.methods.Helper;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DataBaseConnection {

    public static void main(String[] args) {
        database();
    }

    public static void database(){

        //JDBC driver name and database url
        final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
//        final String JDBC_Driver = "com.microsoft.jdbc.sqlserver.SqlServerDriver";
//        final String DB_URL = "jdbc:mysql://localhost:3306/test";
//        final String DB_URL = "jdbc:sqlserver://imovingsqlserver.database.windows.net:1433:databaseName=iMovingQA";
        final String DB_URL =
                "jdbc:sqlserver://imovingsqlserver.database.windows.net:1433;"
                        + "database=iMovingQA;"
                        + "user=admin-imoving;"
                        + "password=Q!w2e3r4t5y6;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        //Database credentials
//        final String user = "root";
        final String user = "admin-imoving";
//        final String pass = "12345";
        final String pass = "Q!w2e3r4t5y6";

        Connection conn = null;
        Statement stmt = null;
        String cName = "";
        String population = "";

        Date moveDate = new Date();
        String moveDateRes = "";

//        System.out.println("--------------------");
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Calendar cal = Calendar.getInstance();
//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.DATE, -6);
//        cal.add(Calendar.HOUR, -9);
//        System.err.println("Test: "+dateFormat.format(moveDate));
//        System.err.println("Current Date Time : " + dateFormat.format(cal.getTime()));

        try{
            //Register JDBC driver
            Class.forName(JDBC_Driver);
            //Open Connection
            try {
                conn = DriverManager.getConnection(DB_URL, user, pass);

                //Execute a Query
                stmt = conn.createStatement();
                String sqlQuery = "Select * from ImovingOrder where Id = 82655";
                String updateDateQuery = "";

                ResultSet resultSet = stmt.executeQuery(sqlQuery);

                //Extract data from result set
            System.out.println("Date before changing:");
            while(resultSet.next()){
                cName = resultSet.getString("ClientEmail");
                moveDate = resultSet.getTimestamp("MoveDate");
                System.out.println(cName+" "+moveDate);

            }
                updateDateQuery = "update ImovingOrder\n" +
                        "set MoveDate = dateadd(day, +6, GETDATE())\n" +
//                    "where date(MoveDate)=`"+moveDate+"`";
                        "where Id = 82655;";
                stmt.executeUpdate(updateDateQuery);

                //Close all connection
                resultSet.close();
                stmt.close();
                conn.close();
                System.out.println(Helper.color("green")+"Data updated, connection closed"+Helper.color("reset"));
            } catch (SQLException e) {
                System.out.println(Helper.color("red")+"Oops, there's an error:"+Helper.color("reset"));
                e.printStackTrace();
            }
        }catch (ClassNotFoundException e ){
            // TODO Auto-generated catch block
            System.out.println(Helper.color("red")+"Oops, there's an error:"+Helper.color("reset"));
            e.printStackTrace();
        }

    }
}

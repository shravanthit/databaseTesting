package com.DatabaseTesting.mySql;

import java.sql.*;

public class QueryData {

    public static void main(String args[]) throws Exception {

        Connection con = null;
        String dbUrl = "jdbc:mysql://localhost:3306/classicmodels?useSSL=true";
        String driver = "com.mysql.cj.jdbc.Driver";
        String userName ="root";
        String password ="Shrav@123";

        Class.forName( driver ).newInstance();
        con = DriverManager.getConnection( dbUrl,userName,password );
        System.out.println( "Connection Established" );

        Statement statements = con.createStatement();
        ResultSet rs = statements.executeQuery( "select *from customers" );
        //ResultSet rs1 = statements.executeQuery( "select * from employees");


        while (rs.next()){
            System.out.println( "CustomeName is :" +rs.getString( "contactFirstName" ));

        }
        rs.close();

    }
}

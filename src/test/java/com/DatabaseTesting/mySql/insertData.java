package com.DatabaseTesting.mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertData {
    public static void main(String args[]) throws Exception {

        Connection con = null;
        String dbUrl = "jdbc:mysql://localhost:3306/classicmodels?useSSL=true";
        String driver = "com.mysql.cj.jdbc.Driver";
        String userName = "root";
        String password = "Shrav@123";

        Class.forName( driver ).newInstance();
        con = DriverManager.getConnection( dbUrl, userName, password );
        System.out.println( "Connection Established" );

        PreparedStatement ps = con.prepareStatement( "INSERT into customers(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit)VALUES('497','stationShop','shravanthi','Thuma','7466977028','6 May','bex','london','kent','DA7','UK','W12A43','250000')" );
        ps.executeQuery();
        ps.close();
    }
}


package com.org.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper 
{
    public static Connection getConObj()
    {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Jaya@324");
			return con;
		} catch (Exception e) { 
			e.printStackTrace();
		}
    	
    	return null;
    }
}

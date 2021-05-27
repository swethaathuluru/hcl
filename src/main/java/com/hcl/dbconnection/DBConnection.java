package com.hcl.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	private final static String url="jdbc:mysql://localhost:3306/hcl";
	 private final static String UserName="root";
	 private final static String Password="root123";
	 
	 public DBConnection() {
		 
	 }
	 private static Connection con=null;
	 
	  public static Connection getConnection() {
		  try {
			  if(con==null)
			  
				  con=DriverManager.getConnection(url,UserName,Password);
		  }
		  catch(SQLException ex) {
			  ex.printStackTrace();
			  
			  
		  }
		return con;
	  }

}

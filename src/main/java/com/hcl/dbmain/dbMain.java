package com.hcl.dbmain;

import com.hcl.dbconnection.DBConnection;

public class dbMain {
public static void main(String[] args) {
	System.out.println("connected");
	System.out.println(DBConnection.getConnection());
}
}

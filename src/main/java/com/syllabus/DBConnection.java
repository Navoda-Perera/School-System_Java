package com.syllabus;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static String url = "jdbc:mysql://localhost:3306/school_info";
	private static String username = "root";
	private static String password = "2210";
	
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e) {
			System.out.println("Database connection not success!!");
		}
		return con;
	}
}

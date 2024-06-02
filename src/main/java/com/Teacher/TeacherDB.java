package com.Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeacherDB {
	

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Teacher> validate(String username, String password){
		
		ArrayList<Teacher> tea = new ArrayList<>();
		
		
		try {
			
			con = DBconnector.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from teacher where uname = '"+username+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 String email = rs.getString(3);
				 int number = rs.getInt(4);
				 String address = rs.getString(5);
				 String dob = rs.getString(6);
				 String uname = rs.getString(7);
				 String pas= rs.getString(8);
				 
				 Teacher t = new Teacher(id, name, email, number, address, dob, uname, pas);
				 tea.add(t);
				 
			 }
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		return tea;
		
	}
	//insertDetails
	public static boolean insertTeacher(String name, String pname, String email, String pnum, String address, String dob, String uname, String password) {
		
		boolean isSuccess = false;
		
			try {
					
				con = DBconnector.getConnection();
				stmt = con.createStatement();
				
				 String sql = "INSERT INTO teacher (name, email, number, address, dob, uname, password) " +
	                     "VALUES ('" + name + "', '" + email + "', '" + pnum + "', '" + address + "', '" + dob + "', '" + uname + "', '" + password + "')";
			        int rs = stmt.executeUpdate(sql);

				 
				 if(rs> 0) {
					 
					 isSuccess = true;
					 
				 }
				 else {
					 
					 isSuccess = false;
				 }
					
				
			}
			
			catch(Exception e){
				
				e.printStackTrace();
				
			}
		
		return isSuccess;
	}
	 public static boolean updateteacher(String id, String name, String email, String pnum, String address, String dob, String uname, String password) {
	    	
	    	boolean isSuccess = false;
	    	
			try {
	    		
	    		con = DBconnector.getConnection();
				stmt = con.createStatement();
				
	    		String sql = "update teacher set name='"+name+"',email='"+email+"',number='"+pnum+"', address='"+address+"', dob='"+dob+"', uname='"+uname+"',password='"+password+"'"
	    				+ "where id='"+id+"'";
	    		
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs> 0) {
					 
					 isSuccess = true;
					 
				 }
				 else {
					 
					 isSuccess = false;
				 }
					
				
			}
			
			catch(Exception e){
				
				e.printStackTrace();
			
			}
		
		return isSuccess;
}
	 
	 public static List<Teacher> getteacherDetails(String id) {
		 
		    int convertedID = Integer.parseInt(id);
		    
		    ArrayList<Teacher> tea = new ArrayList<>();

		    try (Connection con = DBconnector.getConnection();
		         Statement stmt = con.createStatement();
		         ResultSet rs = stmt.executeQuery("SELECT * FROM teacher WHERE id = " + convertedID)) {

		        while (rs.next()) {
		            int idTeacher = rs.getInt(1);
		            String name = rs.getString(2);
		            String email = rs.getString(3);
		            int number = rs.getInt(4);
		            String address = rs.getString(5);
		            String dob = rs.getString(6);
		            String uname = rs.getString(7);
		            String password = rs.getString(8);

		            Teacher t = new Teacher(idTeacher, name, email, number, address, dob, uname, password);
		            tea.add(t);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return tea;
		    
		}
	 public static boolean deleteteacher(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	boolean isSuccess = false;
	    	
			try {
	    		
	    		con = DBconnector.getConnection();
				stmt = con.createStatement();
	    		
	    		String sql = "delete from teacher where id='"+convId+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if (rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }

}

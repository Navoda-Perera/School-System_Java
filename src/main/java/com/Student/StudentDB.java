package com.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDB {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Student> validate(String username, String password){
		
		ArrayList<Student> stu = new ArrayList<>();
		
		
		try {
			
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from student where uname = '"+username+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 
				 int idStudent = rs.getInt(1);
				 String name = rs.getString(2);
				 String email = rs.getString(3);
				 int number = rs.getInt(4);
				 String address = rs.getString(5);
				 String dob = rs.getString(6);
				 String uname = rs.getString(7);
				 String pas= rs.getString(8);
				 
				 Student s = new Student(idStudent, name, email, number, address, dob, uname, pas);
				 stu.add(s);
				 
			 }
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		return stu;
	}
	
	//insert student
	public static boolean insertstudent(String name, String pname, String email, String pnum, String address, String dob, String uname, String password) {
		
		boolean isSuccess = false;
		
			try {
					
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				
				 String sql = "INSERT INTO student (name, email, number, address, dob, uname, password) " +
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
	 public static boolean updatestudent(String id, String name, String email, String pnum, String address, String dob, String uname, String password) {
	    	
	    	boolean isSuccess = false;
	    	
			try {
	    		
	    		con = DBconnect.getConnection();
				stmt = con.createStatement();
				
	    		String sql = "update student set name='"+name+"',email='"+email+"',number='"+pnum+"', address='"+address+"', dob='"+dob+"', uname='"+uname+"',password='"+password+"'"
	    				+ "where idstudent='"+id+"'";
	    		
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
	 
	 public static List<Student> getStudentDetails(String id) {
		 
		    int convertedID = Integer.parseInt(id);
		    
		    ArrayList<Student> stu = new ArrayList<>();

		    try (Connection con = DBconnect.getConnection();
		         Statement stmt = con.createStatement();
		         ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE idStudent = " + convertedID)) {

		        while (rs.next()) {
		            int idStudent = rs.getInt(1);
		            String name = rs.getString(2);
		            String email = rs.getString(3);
		            int number = rs.getInt(4);
		            String address = rs.getString(5);
		            String dob = rs.getString(6);
		            String uname = rs.getString(7);
		            String password = rs.getString(8);

		            Student s = new Student(idStudent, name, email, number, address, dob, uname, password);
		            stu.add(s);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return stu;
		}
	 public static boolean deleteStudent(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	boolean isSuccess = false;
	    	
			try {
	    		
	    		con = DBconnect.getConnection();
				stmt = con.createStatement();
	    		
	    		String sql = "delete from student where idStudent='"+convId+"'";
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




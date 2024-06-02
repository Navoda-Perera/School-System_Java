package com.Student;

public class Student {

	private int idStudent;
	private String name;
	private String email;
	private int number;
	private String address;
	private String dob;
	private String uname;
	private String password;
	
	public Student(int idStudent, String name, String email, int number, String address, String dob, String uname,
			String password) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.email = email;
		this.number = number;
		this.address = address;
		this.dob = dob;
		this.uname = uname;
		this.password = password;
	}

	public int getIdStudent() {
		return idStudent;
	}



	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}



	public int getNumber() {
		return number;
	}



	public String getAddress() {
		return address;
	}

	

	public String getDob() {
		return dob;
	}



	public String getUname() {
		return uname;
	}

	

	public String getPassword() {
		return password;
	}

	
	
	
	
	
}

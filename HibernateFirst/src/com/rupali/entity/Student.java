package com.rupali.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@Column(name="Sid")
	private int sid;
	
	@Column(name="First_Name")
	private String fName;
	
	@Column(name="Last_Name")
	private String lName;
	
	@Column(name="Email")
	private String email;
	
	public Student() {}

	public Student(int sid, String fName, String lName, String email) {
		super();
		this.sid = sid;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
	}
	
	
	
	

}

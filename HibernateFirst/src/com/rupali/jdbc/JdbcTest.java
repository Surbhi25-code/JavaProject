package com.rupali.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) {
		String conURL="jdbc:mysql://localhost:3306/ibm";
		String user="root";
		String pass="root";
		
		try {
			Connection con=DriverManager.getConnection(conURL,user,pass);
			System.out.println("Successful");
		}
		catch(SQLException e) {
          System.out.println(e);
	}

}
}

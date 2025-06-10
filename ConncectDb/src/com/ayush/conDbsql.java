package com.ayush;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conDbsql {

	public static void main(String[] args) throws Exception {

		// Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Step 1");

		//Connection 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ds", "root", "root");

		System.out.println("Step 2");

		// Sql Query 
		String query = "INSERT into emp VALUE(111, 'Rush', 50000, 'Pune', 'IT' );";

		Statement statement = connection.createStatement();

		System.out.println("Step 3");
		statement.executeQuery(query);

//		System.out.println(rs);

//	while(rs.next()) {
//			
//			String id = rs.getString(1);
//			String name = rs.getString(2);
//			String salary = rs.getString(3);
//			String location = rs.getString(4);
//			String department = rs.getString(5);
//			
//			System.out.println(id +" "+ name +" "+ salary +" "+ location+ " "+ department);
//		}

	}

}

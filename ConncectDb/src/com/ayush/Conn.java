package com.ayush;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn {

	public static void main(String[] args) throws Exception {
		// Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connection Code
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ds", "root", "root");

		// Query
		String query = "Select * from emp";

		// Statement
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);

		//Print information
		while (rs.next()) {

			String id = rs.getString(1);
			String name = rs.getString(2);
			String salary = rs.getString(3);
			String location = rs.getString(4);
			String department = rs.getString(5);

			System.out.println(id + " " + name + " " + salary + " " + location + " " + department);
		}

	}

}

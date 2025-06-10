package com.ayush;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertData {

	private static void showData() throws Exception {

		// Insert Data 
		// Load Class Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Connection 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ds", "root", "root");

		// Sql Query
		String query = "Select *  from emp";

		// Statement
		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery(query);

		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String Salary = rs.getString(3);
			String dep = rs.getString(4);
			String location = rs.getString(5);

			System.out.println(id + " , " + name + ", " + Salary + " , " + dep + " , " + location);

		}

	}

	// Delete Data
	private static void DelateData(int num) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ds", "root", "root");

		PreparedStatement ps = connection.prepareStatement("delete from emp WHERE id = ?");
		ps.setLong(1, num);

		int howmany = ps.executeUpdate();
		System.out.println("Changes in data : " + howmany);

	}

	// Insert Data
	private static void insertData(int id, String name, int Salary, String department, String location)
			throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ds", "root", "root");

		PreparedStatement ps = connection.prepareStatement("Insert into emp Value(?, ?, ? , ?, ?)");

		ps.setLong(1, id);
		ps.setString(2, name);
		ps.setLong(3, Salary);
		ps.setString(4, department);
		ps.setString(5, location);

		int howmany = ps.executeUpdate();

		System.out.println(howmany);

	}

	public static void main(String[] args) throws Exception {

//		insertData(117, "Aashi", 89000, "Doc", "Dubai");
//
		showData();

//		DelateData(111);

	}

}

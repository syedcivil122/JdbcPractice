package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOperation {
	public void saveEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
			Statement stmt=con.createStatement();
			int insertedRow = stmt.executeUpdate("insert into student(sname,age,branch,fees) values('syed',25,'civil',50000),('sonu',20,'mca',45000),('karim',26,'EEE',50000)");
					System.out.println("insertedRows "+ insertedRow);
			        con.close();
					}catch (ClassNotFoundException e) {
						e.printStackTrace();
					}catch (SQLException e) {
						e.printStackTrace();	
					}
	}
	
	public void updated() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
			Statement stmt=con.createStatement();
			int insertedRow = stmt.executeUpdate("update student set branch='b.com' where sid=3");
					System.out.println("insertedRows "+ insertedRow);
			        con.close();
					}catch (ClassNotFoundException e) {
						e.printStackTrace();
					}catch (SQLException e) {
						e.printStackTrace();	
					}
	}
	
	public void deleteEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
			Statement stmt=con.createStatement();
			int insertedRow = stmt.executeUpdate("delete from student where sid=2;");
					System.out.println("insertedRows "+ insertedRow);
			        con.close();
					}catch (ClassNotFoundException e) {
						e.printStackTrace();
					}catch (SQLException e) {
						e.printStackTrace();	
					}
	}
	
	public void getEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //load the driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb12","root","root");
			Statement stmt=con.createStatement();
			int insertedRow = stmt.executeUpdate("select ename,dept from employee");
					System.out.println("insertedRows "+ insertedRow);
			        con.close();
					}catch (ClassNotFoundException e) {
						e.printStackTrace();
					}catch (SQLException e) {
						e.printStackTrace();	
					}
	}
	
	
	
	
	
	public static void main(String[] args) {
		StaticOperation so=new StaticOperation();
//		so.saveEmployee();
		so.updated();
//		so.deleteEmployee();
//		so.getEmployee();
	}

}

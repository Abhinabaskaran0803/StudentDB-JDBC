package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.jdbc.Driver");   //load driver
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Abhinav@8323");
			 Statement st = con.createStatement();
			 String sql = "CREATE DATABASE STUDENTDATA";
			 st.executeUpdate(sql);
			 System.out.println("Database Created Sucessfully...");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}

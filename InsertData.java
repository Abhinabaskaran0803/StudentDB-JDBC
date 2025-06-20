package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdata","root","Abhinav@8323");
			Statement st = con.createStatement();
			String sql = "insert into userdata (id,Name,age,Mobile,Email,place)" + "Values(1001, 'Abhinav' , 22,'8778948004','abhinav@gmail.com','vennanthur')";
			sql = "insert into userdata (id,Name,age,Mobile,Email,place)" + "Values(1002, 'Jamuna' , 24,'9070567345','jamuna@gmail.com','chennai')";
			sql = "insert into userdata (id,Name,age,Mobile,Email,place)" + "Values(1003, 'Dhan' , 23,'8647347852','dhan@gmail.com','namakkal')";
			sql = "insert into userdata (id,Name,age,Mobile,Email,place)" + "Values(1004, 'Bhuvana' , 42,'6453782937','bhuvi@gmail.com','salem')";
			sql = "insert into userdata (id,Name,age,Mobile,Email,place)" + "Values(1005, 'Surya' , 25,'8935268289','surya@gmail.com','ambattur')";
			System.out.println("Data Inserted Successfully");
			st.executeUpdate(sql);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}

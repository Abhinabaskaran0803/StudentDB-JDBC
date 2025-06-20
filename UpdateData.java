package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentdata","root","Abhinav@8323");
			Statement st = con.createStatement();
			String sql="UPDATE userdata SET age=41 WHERE ID='1004'";
			st.executeUpdate(sql);
			System.out.println("Data Updated in userdata Table...");
			ResultSet rs = st.executeQuery("select * from userdata");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " +rs.getString(2) + " " +rs.getString(3) + " " +rs.getString(4) +  " " +rs.getString(5)
				+ " " +rs.getString(6));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}

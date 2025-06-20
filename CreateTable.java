package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            // Updated to recommended driver class (optional step)
            Class.forName("com.mysql.jdbc.Driver"); 
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Studentdata", 
                "root", 
                "Abhinav@8323"
            );

            Statement st = con.createStatement();

            String sql = "CREATE TABLE USERDATA (" +
                         "id INTEGER NOT NULL, " +
                         "Name VARCHAR(255), " +
                         "age INTEGER, " +
                         "Mobile VARCHAR(255), " +
                         "Email VARCHAR(255), " +
                         "place VARCHAR(255), " +
                         "PRIMARY KEY(id))";

            st.executeUpdate(sql);
            System.out.println("Created table in given database...");
            
            con.close(); // Always good to close connection

        } catch(Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}


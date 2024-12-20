package database;

import java.sql.*;


public class TestConnection {

	public static void main(String[] args) {
		try {
			
            String url = "jdbc:mysql://localhost:3306/capgemini";
            String username ="root";
            String password = "123456";
            
            Connection con = DriverManager.getConnection(url , username , password);
            System.out.println("Connection Success");
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from login");
            
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
            
            con.close();
		}catch(Exception e) {
            System.out.println(e);
		}

	}

}

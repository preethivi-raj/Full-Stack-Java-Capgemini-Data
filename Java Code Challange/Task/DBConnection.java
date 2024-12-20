package Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection(String dbName) throws SQLException {
		  String url="jdbc:mysql://localhost:3306/"+dbName;
		  String userName="root";
		  String password="123456";
		return DriverManager.getConnection(url , userName , password);
	}	
}

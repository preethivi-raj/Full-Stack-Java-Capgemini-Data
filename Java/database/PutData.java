package database;

import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;

public class PutData {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);

		try {
		    Connection con = ConnectingDB.getConnection("cpagemini");
			System.out.println("Connection Success");
			
			String sql = "CREATE TABLE IF NOT EXISTS skill (" +
				    "courseId INT PRIMARY KEY, " +
				    "courseName VARCHAR(50), " +
				    "registrationDate DATE, " +
				    "fee DECIMAL(10, 2), " +
				    "duration VARCHAR(50)" +
				    ")";
			
			
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate(sql);
			System.out.println("Skill table cretaed successfully");
			
			
			System.out.println("Enter course Id");
			int id =sc.nextInt();
			
			System.out.println("Enter course Name");
			String name = sc.nextLine();
			sc.next();
			System.out.println("Enter Registration date (YYYY-MM-DD)");
			String date=sc.nextLine();
			sc.next();
			System.out.println("Enter Fee");
			
			double fee=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Duration");
			String du = sc.nextLine();
			
			String insertSql="insert into skill (courseId , courseName , registrationDate , fee,Duration) values(?,?,?,?,?)";
		
		  PreparedStatement pstmt = con.prepareStatement(insertSql);
		  
		  pstmt.setInt(1, id);
		  pstmt.setString(2, name);
		  pstmt.setDate(3, Date.valueOf(date));
		  pstmt.setDouble(4, fee);
		  pstmt.setString(5, du);
		  
		  
		  int row = pstmt.executeUpdate();
		  
		  if( row>0) {
			  System.out.println("data inserted");
		  }else {
			  System.out.println("Failed");
		  }
		  pstmt.close();
			stmt.close();
			con.close();
			sc.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

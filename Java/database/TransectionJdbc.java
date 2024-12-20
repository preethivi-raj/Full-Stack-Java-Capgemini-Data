package database;

import java.sql.*;

public class TransectionJdbc {

	public static void main(String[] args) {
		try {
			Connection con = ConnectingDB.getConnection("transections");
			System.out.println("DB Connected");
			
			con.setAutoCommit(false);
			
			String debit  = "update account set balance =  balance - ? where account_id = ?";
			String credit = "update account set  balance =  balance + ? where account_id = ?";
			
			PreparedStatement dpst = con.prepareStatement(debit);
			
			dpst.setInt(1, 1000);
			dpst.setInt(2, 1);
			
			int row = dpst.executeUpdate();
			
			if(row==0) {
				throw new SQLException("Debit Operation not working");
			}
			
			PreparedStatement cpst = con.prepareStatement(credit) ; 
			
			cpst.setInt(1, 19);
			cpst.setInt(2, 2);
			
			int rows =cpst.executeUpdate();
			if(rows==0) {
				throw new SQLException("Debit Operation not working");
			}
			con.commit();
			System.out.println("Transection Completed Successfully");
			
		}
		catch(Exception e) {
			System.err.print(e);
		}

	}

}

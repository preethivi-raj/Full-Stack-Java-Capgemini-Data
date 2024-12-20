package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;


public class Stored {

	public static void main(String[] args) {
       try {
			Connection con = ConnectingDB.getConnection("transections");
			String query = "{call getBalance(?,?)}";
			CallableStatement stm =con.prepareCall(query);
			stm.setInt(1, 2);
			stm.registerOutParameter(2, Types.INTEGER);
			stm.executeUpdate();
			System.out.println(stm.getInt(2));
			con.close();
       }catch(Exception e) {
    	   System.err.println(e);
       }
	}

}

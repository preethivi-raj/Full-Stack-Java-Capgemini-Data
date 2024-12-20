package database;

import java.sql.Connection;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) {
		try {
			
			String q1 = "update account set balance = 1000 where account_id =1;";
			String q2 = "update account set balance = 1000 where account_id =2;";
			String q3 = "update account set balance = 1000 where account_id =3;";
			String q4 = "update account set balance = 5000 where account_id =4;";

			Connection con = ConnectingDB.getConnection("transections");
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			st.addBatch(q4);
			
			int rows[] = st.executeBatch();
			
			for(int i=0 ;i<rows.length; i++) {
				if(rows[i]>0)
					continue;
				else
				    con.rollback();
			}
			con.commit();
			con.close();
		}
		catch(Exception e) {
			System.err.print(e);
		}

	}

}

package Task;

import java.sql.*;


public class Players extends AbstractPlayer implements PlayerOperations  {

	public Players(int id, String name, String skill, int exp, String country, double overall_score) {
		super(id, name, skill, exp, country, overall_score);
	}


	@Override
	public void addNewPlayer(Players player) throws SQLException {
		
			String query = "INSERT INTO players (name, skill, exp, country, overall_score) VALUES (?, ?, ?, ?, ?)";
			Connection con = DBConnection.getConnection("PlayerDB");
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,player.getName());
			ps.setString(2, player.getSkill());
			ps.setInt(3, player.getExp());
			ps.setString(4,player.getCountry());
			ps.setDouble(5, player.getOverall_score());
			
			int row = ps.executeUpdate();
			
			if(row>0) {
				con.commit();
				System.out.println("New Player Added : " + player.getName());
			}
			else {
				con.rollback();
			}
			
			
		
	}

	@Override
	public Players getPlayer(int id) throws SQLException {
		
			String query = "select * from players where id = ?";
			Connection con = DBConnection.getConnection("PlayerDB");
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			Players player =null;
			
			while(rs.next()) {
			   player = new Players(rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getInt(4),rs.getString(5),
						rs.getDouble(6));
			}
			return player;
	}

	@Override
	public void updatePlayer(Players player) throws SQLException {
		

		String query = "UPDATE players SET name = ?, skill = ?, exp = ?, country = ?, overall_score = ? WHERE id = ? ";
		Connection con = DBConnection.getConnection("PlayerDB");
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1,player.getName());
		ps.setString(2, player.getSkill());
		ps.setInt(3,player.getExp());
		ps.setString(4, player.getCountry());
		ps.setDouble(5,player.getOverall_score());
		ps.setInt(6, player.getId());
		
		int row =ps.executeUpdate();
		
		if(row>0) {
			con.commit();
		}
		else {
			con.rollback();
		}
	}

	@Override
	public void removePlayer(int id) throws SQLException {

		String query = "DELETE FROM players WHERE id = ?";
		Connection con = DBConnection.getConnection("PlayerDB");
		
		con.setAutoCommit(false);
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
        int row =ps.executeUpdate();
        
        if(row>0) {
        	con.commit();
        }
        else {
        	con.rollback();
        }
	}
	
	@Override
	public void display(Players player) {
		System.out.println(player.getId() + " " + player.getName() + " "+player.getSkill() + " "+player.getExp() +" "+player.getOverall_score()+" "+player.getCountry());
	}
	
}

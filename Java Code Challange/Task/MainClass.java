package Task;

import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		
		Players player = new Players(1, "Rahul","Batsman" , 25, "Mumbai", 10000.0);
		
		player.display(player);
		
		player.addNewPlayer(player);
		player.getPlayer(1);
		
		player.setName("Rahul Dravid");
		
		player.updatePlayer(player);
		
		player.removePlayer(1);
	}

}

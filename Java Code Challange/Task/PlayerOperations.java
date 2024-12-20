package Task;

import java.sql.SQLException;

public interface PlayerOperations {
      void addNewPlayer(Players player) throws SQLException;
      
      Players getPlayer(int id) throws SQLException;
      
      void updatePlayer(Players player) throws SQLException ;
      
      void removePlayer(int id) throws SQLException;
      
      void display(Players player);

	
}

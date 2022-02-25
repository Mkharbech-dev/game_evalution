package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Game;

public class gameDao {
	//Appel de la connection
	Connection connect = Connect.getConnection();
	//Creer un jeu
			public Game create(Game game) {
				
				
				try {
					PreparedStatement sql = connect.prepareStatement("INSERT INTO game (title, min_players, max_players)"
							+ " VALUES (?,?,?)");
					sql.setString(1, game.getTitle());
					sql.setInt(2, game.getMin_players());
					sql.setInt(3, game.getMax_players());

					sql.executeUpdate();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return game;
			}
			//Read
			public List<Game> read() {
				List<Game> listeJeu = new ArrayList<>();
				
				try {
					PreparedStatement req = connect.prepareStatement("SELECT * FROM game ");
					
					ResultSet rs = req.executeQuery();
					
					while(rs.next()) {
						Game game = new Game();
						
						game.setId(rs.getInt("id"));
						game.setTitle(rs.getString("title"));
						game.setMin_players(rs.getInt("min_players"));
						game.setMax_players(rs.getInt("max_players"));
						
						listeJeu.add(game);
					}
					//System.out.println(listeUser);
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("lecture KO - KO - KO");
				}
				return listeJeu;
			}
}

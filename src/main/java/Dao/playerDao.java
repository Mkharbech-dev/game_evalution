package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Player;



public class playerDao {
	//Appel de la connection
		Connection connect = Connect.getConnection();
		
		//verification d'email si existant deja!
		public boolean mailExist(String email) {
			Boolean msg = false;
			try {
				PreparedStatement sql = connect.prepareStatement("SELECT * FROM player WHERE email = ?");
				
				sql.setString(1, email);
				
				ResultSet rs = sql.executeQuery();
				
				if(!rs.next()) {
					msg = true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return msg;
		}
		
		//Creer un joueur
		public Player create(Player player) {
			
			try {
				PreparedStatement sql = connect.prepareStatement("INSERT INTO player (email, nickname)"
						+ " VALUES (?,?)");
				sql.setString(1, player.getEmail());
				sql.setString(2, player.getNickname());

				sql.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return player;
		}
		
		public List<Player> read() {
			List<Player> listeUser = new ArrayList<>();
			
			try {
				PreparedStatement req = connect.prepareStatement("SELECT * FROM player ");
				
				ResultSet rs = req.executeQuery();
				
				while(rs.next()) {
					Player player = new Player();
					
					player.setId(rs.getInt("id"));
					player.setEmail(rs.getString("email"));
					player.setNickname(rs.getString("nickname"));
					
					listeUser.add(player);
				}
				//System.out.println(listeUser);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("lecture KO - KO - KO");
			}
			return listeUser;
		}
}

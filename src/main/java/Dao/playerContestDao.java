package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.playerContest;


public class playerContestDao {
	//Appel de la connection
			Connection connect = Connect.getConnection();
			
			//ajouter  un joueur au match
			public playerContest create(playerContest playcont) {
				
				try {
					PreparedStatement sql = connect.prepareStatement("INSERT INTO player_contest (player_id, contest_id)"
							+ " VALUES (?,?)");
					sql.setInt(1, playcont.getPlayer_id());
					sql.setInt(2, playcont.getContest_id());

					sql.executeUpdate();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return playcont;
			}
}

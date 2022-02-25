package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Contest;
import Model.Game;
import Model.Player;



public class contestDao {
	//Appel de la connection
		Connection connect = Connect.getConnection();
		//Creer un jeu
				public Contest create(Contest cont) {
					
					
					try {
						PreparedStatement sql = connect.prepareStatement("INSERT INTO contest (game_id, start_date, winner_id)"
								+ " VALUES (?,now(),?)");
						sql.setInt(1, cont.getGame_id());
						sql.setInt(2, cont.getWinner_id());

						sql.executeUpdate();
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return cont;
				}
				//Read
				public List<Contest> read() {
					List<Contest> listeMatch = new ArrayList<>();
					
					try {
						PreparedStatement req = connect.prepareStatement("SELECT * FROM contest ");
						
						ResultSet rs = req.executeQuery();
						
						while(rs.next()) {
							Contest cont = new Contest();
							
							cont.setId(rs.getInt("id"));
							cont.setGame_id(rs.getInt("game_id"));
							cont.setStart_date(rs.getDate("start_date"));
							cont.setWinner_id(rs.getInt("winner_id"));
							
							listeMatch.add(cont);
						}
						//System.out.println(listeUser);
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("lecture KO - KO - KO");
					}
					return listeMatch;
				}
				
				//Read
				public List<Contest> readContest() {
					List<Contest> listeMatch = new ArrayList<>();
					
					try {
						PreparedStatement req = connect.prepareStatement("SELECT * FROM contest inner join player on contest.winner_id = "
								+ "player.id inner join game on contest.game_id = game.id ");
						
						ResultSet rs = req.executeQuery();
						
						while(rs.next()) {
							Contest cont = new Contest(rs.getInt( "id" ),rs.getDate( "start_date" ), new Player(rs.getString("nickname")), new Game(rs.getString("title"), rs.getInt("min_players"), rs.getInt("max_players")));
	
							listeMatch.add(cont);
						}
						//System.out.println(listeUser);
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("lecture KO - KO - KO");
					}
					return listeMatch;
				}
				
				//chercher par id
				public Contest getById(int id) {
						try {
							PreparedStatement preparedStatement  = connect.prepareStatement("SELECT * FROM contest inner join player on contest.winner_id ="
									+"player.id inner join game on contest.game_id = game.id  where contest.id=? ");
								preparedStatement.setInt(1,id);							
								ResultSet rs=preparedStatement.executeQuery();
								
								//Contest cont = new Contest();
								while(rs.next()) {
									Contest cont = new Contest(rs.getInt( "id" ),rs.getDate( "start_date" ), new Player(rs.getString("nickname")), new Game(rs.getString("title"), rs.getInt("min_players"), rs.getInt("max_players")));
									return cont;
								}		
						} catch (Exception ex) {
					    	ex.printStackTrace();
					    	return null;
					    }
						return null;
				}
}

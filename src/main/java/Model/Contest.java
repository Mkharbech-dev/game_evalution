package Model;

import java.sql.Date;

public class Contest {
	private Player player;
	private Game game;
	private int id, game_id, winner_id;
	private Date start_date;
	
	
	
	public Contest(int id, Date start_date,Player player, Game game) {
		super();
		this.player = player;
		this.game = game;
		this.id = id;
		this.start_date = start_date;
	}
	public Contest(int id, int game_id, int winner_id, Date start_date) {
		super();
		this.id = id;
		this.game_id = game_id;
		this.winner_id = winner_id;
		this.start_date = start_date;
	}
	public Contest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contest(int game_id, int winner_id) {
		super();
		this.game_id = game_id;
		this.winner_id = winner_id;
	}
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public int getWinner_id() {
		return winner_id;
	}
	public void setWinner_id(int winner_id) {
		this.winner_id = winner_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	@Override
	public String toString() {
		return "Contest [player=" + player + ", game=" + game + ", id=" + id + ", game_id=" + game_id + ", winner_id="
				+ winner_id + ", start_date=" + start_date + "]";
	}

	
	
	

}

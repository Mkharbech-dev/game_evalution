package Model;

public class Game {
	private int id;
	private String title;
	private int min_players, max_players;
	public Game(int id, String title, int min_players, int max_players) {
		super();
		this.id = id;
		this.title = title;
		this.min_players = min_players;
		this.max_players = max_players;
	}
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int count(int a ,int b) {
		return a-b;
	}
	public Game(String title, int min_players, int max_players) {
		super();
		this.title = title;
		this.min_players = min_players;
		this.max_players = max_players;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMin_players() {
		return min_players;
	}
	public void setMin_players(int min_players) {
		this.min_players = min_players;
	}
	public int getMax_players() {
		return max_players;
	}
	public void setMax_players(int max_players) {
		this.max_players = max_players;
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", title=" + title + ", min_players=" + min_players + ", max_players=" + max_players
				+ "]";
	}
	
	
}

package Model;

public class Player {

	private int id;
	private String email;
	private String nickname;
	public Player(int id, String email, String nickname) {
		super();
		this.id = id;
		this.email = email;
		this.nickname = nickname;
	}
	
	public Player(String nickname) {
		super();
		this.nickname = nickname;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String email, String nickname) {
		super();
		this.email = email;
		this.nickname = nickname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", email=" + email + ", nickname=" + nickname + "]";
	}
		
}

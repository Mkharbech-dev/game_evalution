package Model;

public class playerContest {
	
	private int id, player_id, contest_id;

	public playerContest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public playerContest(int id, int player_id, int contest_id) {
		super();
		this.id = id;
		this.player_id = player_id;
		this.contest_id = contest_id;
	}

	public playerContest(int player_id, int contest_id) {
		super();
		this.player_id = player_id;
		this.contest_id = contest_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public int getContest_id() {
		return contest_id;
	}

	public void setContest_id(int contest_id) {
		this.contest_id = contest_id;
	}

	@Override
	public String toString() {
		return "playerContest [id=" + id + ", player_id=" + player_id + ", contest_id=" + contest_id + "]";
	}
	
	
}

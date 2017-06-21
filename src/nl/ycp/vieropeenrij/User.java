package nl.ycp.vieropeenrij;

public class User {
	private String name;
	private int id;
	private int score;
	private int player;
	private int movesDone;
	
	public User(String name, int player) {
		this.name = name;
		id = (int) (Math.random() * 1000);
		this.player = player;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getScore() {
		return score;
	}
	public int getPlayer() {
		return player;
	}
	public int getMovesDone() {
		return movesDone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public void setMovesDone(int movesDone) {
		this.movesDone = movesDone;
	}
}

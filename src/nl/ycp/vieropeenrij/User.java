package nl.ycp.vieropeenrij;

public class User {
	private String name;
	private int id;
	private int score;
	private int player;
	
	public User(String name) {
		this.name = name;
		id = (int) (Math.random() * 1000);
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
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
}

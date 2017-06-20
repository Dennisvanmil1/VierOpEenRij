package nl.ycp.vierOpEenRij;

public class User {
	private String name;
	private int id;
	private int score;
	
	public User(String name) {
		this.name = name;
		id = Math.random() * 1000;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
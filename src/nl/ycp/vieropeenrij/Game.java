package nl.ycp.vieropeenrij;

import java.util.ArrayList;

public class Game {
	private User p1;
	private User p2;
	protected ArrayList<ArrayList<Object>> board = new ArrayList<>();
	
	public Game(String p1,  String p2, int x, int y) {
		this.p1 = new User(p1);
		this.p2 = new User(p2);
		
		for(int i = 0; i < x; i++) {
			for(int ii = 0; ii < y; ii++) {
				board.get(i).set(ii, null);
			}
		}
		System.out.println("new game started");
	}
	
	public Game(String p1,  String p2) {
		this(p1,p2,8,8);
	}

	User getP1() {
		return p1;
	}

	public User getP2() {
		return p2;
	}

	public ArrayList<ArrayList<Object>> getBoard() {
		return board;
	}

	public void setP1(User p1) {
		this.p1 = p1;
	}

	public void setP2(User p2) {
		this.p2 = p2;
	}

	public void setBoard(ArrayList<ArrayList<Object>> board) {
		this.board = board;
	}
	
	
}

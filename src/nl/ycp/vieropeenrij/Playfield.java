package nl.ycp.vieropeenrij;

import java.util.ArrayList;

public class Playfield {
	private int x;
	private int y;
	protected ArrayList<ArrayList<Object>> field = new ArrayList<>();
	
	public Playfield() {
		this(8,8);
	}
	
	public Playfield(int x, int y) {
		this.x = x;
		this.y = y;
		for(int i = 0; i < x; i++) {
			for(int ii = 0; ii < y; ii++) {
				field.get(i).set(ii, null);
			}
		}
	}
	
	public void move(int x, User u) {
		int p = u.getPlayer();
		
	}
}

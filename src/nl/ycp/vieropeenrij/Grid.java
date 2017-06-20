package nl.ycp.vieropeenrij;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Grid
 */
@WebServlet("/Grid")
public class Grid extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int collumnA = 1;
	private int collumnB = 1;
	private int collumnC = 1; 
	private int collumnD = 1; 
	private int collumnE = 1; 
	private int collumnF = 1; 
	private int collumnG = 1; 
	private int collumnH = 1; 
	
	private String token = "XX";
	
	public String getToken() {
		return token;
	}

	public void setToken(String x) {
		this.token = x;
	}

	public int getCollumnA() {
		return collumnA;
	}

	public void setCollumnA(int collumnA) {
		this.collumnA = collumnA;
	}

	public int getCollumnB() {
		return collumnB;
	}

	public void setCollumnB(int collumnB) {
		this.collumnB = collumnB;
	}

	public int getCollumnC() {
		return collumnC;
	}

	public void setCollumnC(int collumnC) {
		this.collumnC = collumnC;
	}

	public int getCollumnD() {
		return collumnD;
	}

	public void setCollumnD(int collumnD) {
		this.collumnD = collumnD;
	}

	public int getCollumnE() {
		return collumnE;
	}

	public void setCollumnE(int collumnE) {
		this.collumnE = collumnE;
	}

	public int getCollumnF() {
		return collumnF;
	}

	public void setCollumnF(int collumnF) {
		this.collumnF = collumnF;
	}

	public int getCollumnG() {
		return collumnG;
	}

	public void setCollumnG(int collumnG) {
		this.collumnG = collumnG;
	}

	public int getCollumnH() {
		return collumnH;
	}

	public void setCollumnH(int collumnH) {
		this.collumnH = collumnH;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Grid g = new Grid();
		g.setCollumnA(1);
		g.setCollumnB(1);
		g.setCollumnC(1);
		g.setCollumnD(1);
		g.setCollumnE(1);
		g.setCollumnF(1);
		g.setCollumnG(1);
		g.setCollumnH(1);
		g.setToken("Y");
		
		request.setAttribute("g", g);
		request.getRequestDispatcher("/WEB-INF/gridform.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	

}

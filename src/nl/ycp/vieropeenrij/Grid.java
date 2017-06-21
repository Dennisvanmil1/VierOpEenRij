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
	
	private int collumnA = 0;
	private int collumnB = 0;
	private int collumnC = 0; 
	private int collumnD = 0; 
	private int collumnE = 0; 
	private int collumnF = 0; 
	private int collumnG = 0; 
	private int collumnH = 0; 
	
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
		g.setCollumnA(8);
		g.setCollumnB(8);
		g.setCollumnC(8);
		g.setCollumnD(8);
		g.setCollumnE(8);
		g.setCollumnF(8);
		g.setCollumnG(8);
		g.setCollumnH(8);
		g.setToken("Y");
		
		request.setAttribute("g", g);
		request.getRequestDispatcher("/WEB-INF/gridform.jsp").forward(request, response);
		
		
		request.getRequestDispatcher("/WEB-INF/startform.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("/startform.jsp");
		doGet(request, response);
	}

	

}

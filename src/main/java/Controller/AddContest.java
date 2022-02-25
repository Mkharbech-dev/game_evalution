package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.contestDao;
import Dao.gameDao;
import Dao.playerDao;
import Model.Contest;
import Model.Game;

/**
 * Servlet implementation class game
 */
@WebServlet("/ajouter-match")
public class AddContest extends HttpServlet {
	contestDao co = new contestDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		gameDao game = new gameDao(); 
		 request.setAttribute("game", game.read());
		 //System.out.println(game.read());
		 
		 playerDao play = new playerDao();
		 request.setAttribute("play", play.read());
		 //System.out.println(play.read());
		request.getRequestDispatcher("View/AddContest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int game = Integer.parseInt(request.getParameter("game"));
		
		System.out.println(game);
		int player = Integer.parseInt(request.getParameter("player"));
		
		Contest cont = new Contest(game,player);
		co.create(cont);
		response.sendRedirect("listContest");
	}
}

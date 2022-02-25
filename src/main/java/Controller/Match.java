package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.contestDao;
import Dao.playerContestDao;
import Dao.playerDao;
import Model.playerContest;


/**
 * Servlet implementation class Match
 */
@WebServlet("/match")
public class Match extends HttpServlet {
	playerDao p = new playerDao();
	contestDao con = new contestDao();
	playerContestDao playCon = new playerContestDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Match() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idMatch"));	
		//System.out.println(id);
		request.setAttribute("matchDetail", con.getById(id));
		//System.out.println(con.getById(id));
		request.setAttribute("match", con.read());
		request.setAttribute("play", p.read());
		
		request.getRequestDispatcher("View/Match.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int player =Integer.parseInt(request.getParameter("player")) ;
		int match = Integer.parseInt(request.getParameter("contest")) ;
		
		playerContest playMatch = new playerContest(player, match);
		playCon.create(playMatch);
		doGet(request, response);
	}

}

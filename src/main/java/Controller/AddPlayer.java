package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.playerDao;
import Model.Player;

/**
 * Servlet implementation class game
 */
@WebServlet("/ajouter-joueur")
public class AddPlayer extends HttpServlet {
	playerDao p = new playerDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("View/AddPlayer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String nickname = request.getParameter("nickname");
		
		Player play = new Player(email, nickname);
		boolean exist = false;
		if(p.mailExist(email)) {
			 p.create(play);
			 exist = false;
			 request.setAttribute("exist",exist);
			 response.sendRedirect("ListJoueur");
		}else {
			exist = true;
			request.setAttribute("exist",exist);
			response.sendRedirect("ajouter-joueur");
		}
	}
}

package co.reposteria.controllers;

import java.io.IOException;

import co.reposteria.dao.ConnectionTokenDao;
import co.reposteria.dao.TypedbDao;
import co.reposteria.dao.UsuarioDao;
import co.reposteria.model.ConnectionToken;
import co.reposteria.model.Typedb;
import co.reposteria.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/TokenController", "/Reportes/TokenController"})
public class TokenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConnectionTokenDao cDao = new ConnectionTokenDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TokenController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("submit");
		switch(action) {
			case "registrar":registrarToken(request, response);
		}
	}
	
	public void registrarToken(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("user_id");
		String type = request.getParameter("type");
		String host = request.getParameter("host");
		String userdb = request.getParameter("userdb");
		String pass = request.getParameter("pass");
		String db = request.getParameter("db");
		String token = request.getParameter("token");
		String port = request.getParameter("port");
		String state = request.getParameter("state");
		
		ConnectionToken c = new ConnectionToken();
		
		UsuarioDao uDao = new UsuarioDao();
		TypedbDao tdDao = new TypedbDao();
		Typedb tp = tdDao.find(type);
		
		Usuario u = uDao.find(Integer.parseInt(usuario));
		
		
		c = new ConnectionToken(host, userdb, pass, db, token, Integer.parseInt(port), Integer.parseInt(state), u, tp);
		cDao.insert(c);

		request.getRequestDispatcher("menu.jsp").forward(request, response);
	}

}

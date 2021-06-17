package co.reposteria.controllers;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import co.reposteria.dao.TypedbDao;
import co.reposteria.model.Typedb;

/**
 * Servlet implementation class TypedbController
 */
@WebServlet("/TypedbController")
public class TypedbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TypedbDao tpDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypedbController() {
        super();
        tpDao = new TypedbDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("submit");
		switch(action) {
			case "registrar":registrarTypedb(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	public void registrarTypedb(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String driver = request.getParameter("driver");
		String descripcion = request.getParameter("description");
		String aditional = request.getParameter("aditional");
		Typedb tp = new Typedb(id, descripcion, driver, aditional);
		tpDao.insert(tp);
		request.getRequestDispatcher("menu.jsp").forward(request, response);
	}

}

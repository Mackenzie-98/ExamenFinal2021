package co.reposteria.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import co.reposteria.dao.RolDao;
import co.reposteria.dao.UsuarioDao;
import co.reposteria.model.Rol;
import co.reposteria.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UsuarioDao userDao;
    public UsuarioController() {
        super();
        userDao=new UsuarioDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("submit").toString();
		switch(action) {
			case "login":validarLogin(request, response);
		}
	}
	
	public void validarLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Usuario found = userDao.findByUser(username);
		if(found!=null&&found.getPass().equals(password)) {
			request.getRequestDispatcher("usuario.jsp").forward(request, response);
		}else {
			PrintWriter pw=response.getWriter();
			pw.write("<h1> Usuario no registrado en el sistema.</h1>");
		}
	}
}
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
		String action = request.getParameter("submit");
		switch(action) {
			case "login":validarLogin(request, response);
			case "redirectRegistrar":request.getRequestDispatcher("registrar_usuario.jsp").forward(request, response);
			case "registrar":registrarUsuario(request, response);
		}
	}
	
	public void validarLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Usuario found = userDao.findByUsername(username);
		if(found!=null&&found.getPass().equals(password) && found.getState()==1) {
			request.getRequestDispatcher("usuario.jsp").forward(request, response);
		}else {
			PrintWriter pw=response.getWriter();
			pw.write("<h1> Usuario no registrado en el sistema.</h1>");
		}
	}
	
	public void registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RolDao rd=new RolDao();
		Rol rol = rd.find(Integer.parseInt(request.getParameter("rol")));
		String username = request.getParameter("usuario");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		Usuario nuevo = new Usuario(username,email,password,rol,1);
		userDao.insert(nuevo);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
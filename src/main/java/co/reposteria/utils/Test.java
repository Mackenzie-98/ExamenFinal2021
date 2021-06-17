package co.reposteria.utils;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.reposteria.dao.RolDao;
import co.reposteria.dao.UsuarioDao;
import co.reposteria.model.Rol;
import co.reposteria.model.Usuario;

public class Test {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
	EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		
//		RolDao r = new RolDao();
//		Rol x= r.find(1);
//		UsuarioDao ud = new UsuarioDao();
//		Usuario u = new Usuario();
//		u.setUsuario("paula");
//		u.setEmail("paula@gmail.com");
//		u.setPass("12345");
//		u.setRole(x);
//		u.setState(1);
//		
//		ud.insert(u);
		
//		UsuarioDao ud = new UsuarioDao();
//		Usuario u = ud.findByUser("paula"); 
//		System.out.println(u.toString());
	}
}

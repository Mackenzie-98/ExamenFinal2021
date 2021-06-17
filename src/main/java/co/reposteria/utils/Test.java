package co.reposteria.utils;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.reposteria.dao.RolDao;
import co.reposteria.model.Rol;

public class Test {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
	EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		RolDao rDao=new RolDao();
		Rol nuevo = new Rol();
		nuevo.setDescripcion("Contador");
		rDao.insert(nuevo);
	}
}

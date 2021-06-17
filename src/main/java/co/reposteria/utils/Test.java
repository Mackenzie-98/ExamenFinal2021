package co.reposteria.utils;

import co.reposteria.dao.RolDao;
import co.reposteria.model.Rol;

public class Test {
	public static void main(String[] args) {
		RolDao rDao=new RolDao();
		rDao.insert(new Rol(1,"Administrador"));
		rDao.insert(new Rol(2,"Cliente"));
	}
}

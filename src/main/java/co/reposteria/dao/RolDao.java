package co.reposteria.dao;

import co.reposteria.model.Rol;
import co.reposteria.utils.Conexion;

public class RolDao extends Conexion<Rol>implements GenericDao<Rol>{
	public RolDao() {
		super(Rol.class);
	}
}
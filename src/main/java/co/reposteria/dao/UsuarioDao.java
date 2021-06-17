package co.reposteria.dao;

import co.reposteria.model.Usuario;
import co.reposteria.utils.Conexion;

public class UsuarioDao extends Conexion<Usuario>implements GenericDao<Usuario>{
	public UsuarioDao() {
		super(Usuario.class);
	}
}

package co.reposteria.dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.persistence.Query;
import javax.sql.StatementEvent;

import co.reposteria.model.Usuario;
import co.reposteria.utils.Conexion;

public class UsuarioDao extends Conexion<Usuario>implements GenericDao<Usuario>{
	public UsuarioDao() {
		super(Usuario.class);
	}
	public Usuario findByUsername(String username){
		try {
			getEm().getTransaction().begin();
			List<Usuario> lista=list();
			for(Usuario cur:lista) {
				if(cur.getUsuario().equals(username)) return cur;
			}
			getEm().getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//getEm().close();
		}
		return null;
	}
}

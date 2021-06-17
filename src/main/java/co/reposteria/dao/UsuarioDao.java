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
	public Usuario findByUser(String user){
		try {
			getEm().getTransaction().begin();
			List<Usuario> lista=list();
			for(Usuario cur:lista) {
				if(cur.getUsuario().equals(user)) return cur;
			}
			getEm().getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//getEm().close();
		}
		return null;
	}
	public boolean validarUsuario(Usuario u){
		Usuario user = this.find(u.getUsuario());
		if(user != null)
			if (user.getPass().contentEquals(u.getPass())){
				return true;
			}
		return false;
	}
}

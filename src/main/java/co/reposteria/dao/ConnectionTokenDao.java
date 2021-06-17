package co.reposteria.dao;

import co.reposteria.model.ConnectionToken;
import co.reposteria.utils.Conexion;

public class ConnectionTokenDao extends Conexion<ConnectionToken> implements GenericDao<ConnectionToken>{
    public ConnectionTokenDao() {    
    	super(ConnectionToken.class);
    }
}
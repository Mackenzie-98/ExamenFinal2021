package co.reposteria.dao;

import co.reposteria.model.Typedb;
import co.reposteria.utils.Conexion;

public class TypedbDao extends Conexion<Typedb> implements GenericDao<Typedb>{
    public TypedbDao(){
        super(Typedb.class);
    }
}
package co.reposteria.dao;

import co.reposteria.model.Seguimiento;
import co.reposteria.utils.Conexion;

public class SeguimientoDao extends Conexion<Seguimiento> implements GenericDao<Seguimiento>{
    public SeguimientoDao(){
        super(Seguimiento.class);
    }
}
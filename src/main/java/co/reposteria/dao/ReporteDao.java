package co.reposteria.dao;

import co.reposteria.model.Reporte;
import co.reposteria.utils.Conexion;

public class ReporteDao extends Conexion<Reporte> implements GenericDao<Reporte>{
    public ReporteDao(){
        super(Reporte.class);
    }
}


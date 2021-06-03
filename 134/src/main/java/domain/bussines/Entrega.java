package domain.bussines;

import java.util.Date;
import java.util.List;

public class Entrega {
    private Date fecha;
    //private Periodicidad periodo;
    private List<Articulo> articulos;

    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);
    }


    /* Constructor */

    public Entrega(Date fecha) {
        this.fecha = fecha;
    }

    /* Getters and Setters*/

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /*public Periodicidad getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodicidad periodo) {
        this.periodo = periodo;
    }*/

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}

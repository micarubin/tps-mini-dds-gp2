package domain.bussines;

public class Envase {
    private Integer codigo;
    private TipoArticulo TipoArticulo;
    private Capacidad capacidad;

    /* Getters and Setters*/

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public domain.bussines.TipoArticulo getTipoArticulo() {
        return TipoArticulo;
    }

    public void setTipoArticulo(domain.bussines.TipoArticulo tipoArticulo) {
        TipoArticulo = tipoArticulo;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Capacidad capacidad) {
        this.capacidad = capacidad;
    }
}

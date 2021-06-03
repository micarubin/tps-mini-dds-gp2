package domain.bussines;

public class Articulo {
    private int codigo;
    private Material material;
    private Envase envase;
    private Integer cantidad;

    /* Constructor */

    public Articulo() {}

    /* Getters and Setters */

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

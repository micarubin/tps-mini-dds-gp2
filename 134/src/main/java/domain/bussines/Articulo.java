package domain.bussines;

public class Articulo {
    private Material material;
    private Envase envase;
    private Integer cantidad;

    /* Constructor */

    public Articulo(Material material, Envase envase, Integer cantidad) {
        this.material = material;
        this.envase = envase;
        this.cantidad = cantidad;
    }

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
}

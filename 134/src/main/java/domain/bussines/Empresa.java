package domain.bussines;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.List;

public class Empresa {
    private String nombre;
    private List<Envase> envases;
    private List<Articulo> stock;

    public void enviarPedido() {

    }

    /*public listarPlazos() {

    }*/

    /* Getters and Setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Envase> getEnvases() {
        return envases;
    }

    public void setEnvases(List<Envase> envases) {
        this.envases = envases;
    }

    public List<Articulo> getStock() {
        return stock;
    }

    public void setStock(List<Articulo> stock) {
        this.stock = stock;
    }
}

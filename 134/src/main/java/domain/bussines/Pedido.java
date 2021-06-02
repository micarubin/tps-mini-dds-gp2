package domain.bussines;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer idPedido;
    private Cliente cliente;
    private List<Entrega> entregas;
    private Periodicidad periodicidad;

    /*public Date calcularFechaEntrega(Date fechaPrimeraEntrega, int numeroEntrega){
        int diasAgregados = numeroEntrega * ;

        return fechaPrimeraEntrega. ;
    }*/

    public static Date agregarDias(Date fecha, int cantidad) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        calendario.add(Calendar.DATE, cantidad);
        return calendario.getTime();
    }

    public Pedido(Integer idPedido, Cliente cliente, Periodicidad periodicidad) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.periodicidad = periodicidad;
    }

    /* Getters and Setters */

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    public Periodicidad getPeriodo() {
        return periodicidad;
    }

    public void setPeriodo(Periodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }
}

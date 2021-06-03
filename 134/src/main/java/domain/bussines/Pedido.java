package domain.bussines;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer idPedido;
    private Cliente cliente;
    private Periodicidad periodicidad;
    private List<Entrega> entregas;

    public Date calcularFechaEntrega(Date fechaPrimeraEntrega, int numeroEntrega){
        int diasAgregados = numeroEntrega * periodicidad.getPeriodicidad();

        return this.agregarDias(fechaPrimeraEntrega, diasAgregados);
    }

    public static Date agregarDias(Date fecha, int dias) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        calendario.add(Calendar.DATE, dias); //minus number would decrement the days
        return calendario.getTime();
    }

    /* Constructor */

    public Pedido(Integer idPedido, Cliente cliente, Periodicidad periodicidad) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.periodicidad = periodicidad;
    }

    public void agregarEntrega(Entrega entrega) {
       this.entregas.add(entrega);
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

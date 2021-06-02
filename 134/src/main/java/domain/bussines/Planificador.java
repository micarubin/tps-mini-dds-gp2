package domain.bussines;

import java.util.List;

public class Planificador {
    private List<Pedido> pedidos;

    public void calcularFechasDeEntrega(){
        //TODO calcularFechasDeEntrega()
    }

    public Integer cantidadPedidos(){
        return pedidos.size();
    }

    /*public Pedido crearPedido(Cliente cliente, Periodicidad periodicidad){
        Pedido nuevoPedido = new Pedido(this.cantidadPedidos(), cliente);
        return nuevoPedido;
    }*/

    /* Getters and Setters*/

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

package domain;

import utils.Singleton;

import java.util.ArrayList;
import java.util.List;

public class  Control {
    private  List<Cliente> clientes;
    public Control() {
        this.clientes =  new ArrayList<>();
    }

    public Control obtenerInstancia(Control control){
        return (Control) Singleton.getInstance(control);
    }

    public long chequearCuentas(Integer dni, Integer saldoTope){
       Cliente clienteEspecificado = this.buscarCliente(dni);
       List<Integer> saldos = this.obtenerListaDeSaldos(clienteEspecificado);
       return saldos.stream().filter(saldo -> saldo > saldoTope).count();
    }

    private Cliente buscarCliente(Integer dni){
        return  (Cliente) clientes.stream().filter(cliente ->cliente.dni == dni);
    }
    public  List<Integer> obtenerListaDeSaldos(Cliente cliente){
      return  (List<Integer>) cliente.getCuentas().stream().map(cuenta -> cuenta.getSaldo());
    }


}

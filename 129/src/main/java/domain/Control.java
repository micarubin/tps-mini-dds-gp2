package domain;
import java.util.List;

public class  Control {
    private  List<Cliente> clientes;
    private static Control instance;
    public Control( List<Cliente> clientes) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.clientes =  clientes;
    }

    public static Control obtenerInstancia(List<Cliente> clientes){
        if (instance == null) {
            instance = new Control(clientes);
        }
        return instance;
    }

    public long chequearCuentas(Integer dni, Integer saldoTope){
        if(clientes.isEmpty()){
            return 0;
        }
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

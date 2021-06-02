package domain.view;

    import domain.bussines.*;

    import java.text.DateFormat;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Date;
    import java.util.List;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        /*Scanner myObj = new Scanner(System.in);

        System.out.println("Ingrese el dni del cliente y el saldo tope");

        int dni = myObj.nextInt();
        int saldo = myObj.nextInt();
        List<Cliente> clientes = new ArrayList<>(); //aca iranlosclientes de la db

        Control control = Control.obtenerInstancia(clientes);

        long cantidadCuentasQueSuperanMonto = control.chequearCuentas(dni, saldo);
        System.out.println("La cantidad de cuentas que superan el saldo es " + cantidadCuentasQueSuperanMonto);*/

        Planificador planificador = new Planificador();
        Scanner consola = new Scanner(System.in);
        DateFormat formatter = new SimpleDateFormat("dd MM yyyy");

        // OBTENGO INFORMACION PARA CREAR PEDIDO

        System.out.println("\nIngrese codigo del cliente: ");
        Cliente cliente = new Cliente();
        cliente.setCodigoCliente(consola.nextLine());



        System.out.println("\nIngrese periodicidad: ");
        Periodicidad periodicidad = Periodicidad.fromInteger(consola.nextInt());

        //CREO PEDIDO
        Pedido pedido = planificador.crearPedido(cliente, periodicidad);

        System.out.println("\nIngrese fecha de la primer entrega: ");
        Date fechaPrimeraEntrega = formatter.parse(consola.nextLine());
        //entrega.setFecha(fecha);

        System.out.println("\nIngrese cantidad de entregas a realizar: ");
        int cantidadEntregas = consola.nextInt();

        for (int numeroEntrega = 0; numeroEntrega < cantidadEntregas; numeroEntrega++){

            Entrega entrega = new Entrega(pedido.calcularFechaEntrega(fechaPrimeraEntrega, numeroEntrega));

            System.out.println("\nPedido nº - Ingrese envase: ");
            System.out.println("\nPedido nº - Ingrese cantidad: ");
            System.out.println("\nPedido nº - Ingrese articulo: ");

        }


    }




}
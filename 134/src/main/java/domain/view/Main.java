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

        Scanner consola = new Scanner(System.in);

        Planificador planificador = new Planificador();
        DateFormat formatter = new SimpleDateFormat("dd MM yyyy");

        /* *** OBTENGO INFORMACION PARA CREAR PEDIDO *** */

        // CREO UN CLIENTE
        System.out.println("\nIngrese codigo del cliente: ");
        Cliente cliente = new Cliente();
        cliente.setCodigoCliente(consola.nextLine());

        // INDICO PERIODICIDAD (para que pueda calcular las entregas)
        System.out.println("\nIngrese periodicidad: ");
        Periodicidad periodicidad = Periodicidad.fromInteger(consola.nextInt());

        //CREO PEDIDO
        Pedido pedido = planificador.crearPedido(cliente, periodicidad);

        /* *** OBTENGO INFORMACION PARA CREAR ENTREGAS *** */

        System.out.println("\nIngrese fecha de la primer entrega: ");
        Date fechaPrimeraEntrega = formatter.parse(consola.nextLine());

        System.out.println("\nIngrese cantidad de entregas a realizar: ");
        int cantidadEntregas = consola.nextInt();

        // CREAR ENTREGAS
        for (int numeroEntrega = 0; numeroEntrega < cantidadEntregas; numeroEntrega++){
            Date fechaEntrega = pedido.calcularFechaEntrega(fechaPrimeraEntrega, numeroEntrega);
            Entrega entrega = new Entrega(fechaEntrega);

            while (consola.nextLine() != "*"){


                System.out.println("\nPedido nº" + numeroEntrega + " - Ingrese material: ");


                //Material material = mafromInteger(consola.nextInt());

                System.out.println("\nPedido nº" + numeroEntrega + " - Ingrese cantidad: ");

               // Articulo articulo = new Articulo();


            }
        }



/*
        System.out.println("\nPedido nº - Ingrese envase: ");
        System.out.println("\nPedido nº - Ingrese cantidad: ");
        System.out.println("\nPedido nº - Ingrese articulo: ");
*/
    }




}
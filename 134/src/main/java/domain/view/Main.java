package domain.view;

    import domain.bussines.*;

    import java.text.DateFormat;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
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

        System.out.println("\nIngrese periodicidad:\n 0.Unica vez\n 1.Semanalmente \n 2.Mensualmente " );
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
            pedido.agregarEntrega(entrega);
        }


        System.out.println("\n Ingrese cod articulo \n Ingrese 0 para terminar");
        int codigoArticulo = consola.nextInt();
        while (codigoArticulo != 0){

           System.out.println("\n Ingrese el diametro, largo y ancho");
           Capacidad capacidad = new Capacidad();
            capacidad.setDiametro(consola.nextInt());
            capacidad.setLargo(consola.nextInt());
            capacidad.setAncho(consola.nextInt());
            // TODO: ingresar material y envanse y cantidad
            int finalCodigoArticulo = codigoArticulo;
            pedido.getEntregas().forEach(entrega -> {
                Envase envanse = new Envase();
                envanse.setCapacidad(capacidad);
                System.out.println("\n Ingrese el tipo de articulo");
                int tipoArticulo = consola.nextInt();
                envanse.setTipoArticulo(TipoArticulo.fromInteger(tipoArticulo));
                Articulo articulo =  new Articulo();
                articulo.setEnvase(envanse);
                articulo.setCodigo(finalCodigoArticulo);
                entrega.agregarArticulo(articulo);
            });
            System.out.println("\n Ingrese cod articulo \n Ingrese 0 para terminar");
            codigoArticulo = consola.nextInt();
        }




        System.out.println("\n Pedido nº: " + pedido.getIdPedido().toString());

    }

}
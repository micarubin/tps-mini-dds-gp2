package domain.view;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ingrese el dni del cliente y el saldo tope");

        int dni = myObj.nextInt();
        int saldo = myObj.nextInt();
        List<Cliente> clientes = new ArrayList<>(); //aca iranlosclientes de la db

        Control control = Control.obtenerInstancia(clientes);

        long cantidadCuentasQueSuperanMonto = control.chequearCuentas(dni, saldo);
        System.out.println("La cantidad de cuentas que superan el saldo es " + cantidadCuentasQueSuperanMonto);
    }

    public void indicarArticulos() {

    }

    public void indicarEnvasado() {

    }

    public void indicarFechaDeEntrega() {

    }
}
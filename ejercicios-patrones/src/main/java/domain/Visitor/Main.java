package domain.Visitor;

public class Main {
    public static void main(String[] args) {
        Interes interes = new Interes();

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();

        CuentaCorriente cuentaCorriente = new CuentaCorriente();

        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito();

        cajaDeAhorro.setMontoTotal(20000);
        cuentaCorriente.setMontoTotal(3000);
        tarjetaDeCredito.setDeuda(5000);

        System.out.println("Interes sobre caja de ahorro: " + interes.interesUtilizado(cajaDeAhorro));
        System.out.println("\nInteres sobre cuenta corriente: " + interes.interesUtilizado(cuentaCorriente));
        System.out.println("\nInteres sobre tarjeta de credito: " + interes.interesUtilizado(tarjetaDeCredito));
    }
}

package domain.Visitor;

public class Interes implements Visitor {
    public double interesUtilizado(CajaDeAhorro cajaDeAhorro) {
        return cajaDeAhorro.getMontoTotal() * 0.01;
    }

    public double interesUtilizado(CuentaCorriente cuentaCorriente) {
        return cuentaCorriente.getMontoTotal() * 0.01;
    }

    public double interesUtilizado(TarjetaDeCredito tarjetaDeCredito) {
        return tarjetaDeCredito.getDeuda() * 0.05;
    }
}

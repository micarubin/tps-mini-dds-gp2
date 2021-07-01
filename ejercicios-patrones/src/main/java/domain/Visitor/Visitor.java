package domain.Visitor;

public interface Visitor {
    double interesUtilizado(CajaDeAhorro cajaDeAhorro);

    double interesUtilizado(CuentaCorriente cuentaCorriente);

    double interesUtilizado(TarjetaDeCredito tarjetaDeCredito);
}

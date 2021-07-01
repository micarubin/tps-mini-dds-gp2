package domain.Visitor;

public class TarjetaDeCredito implements Visitable {
    private double deuda;

    /* Methods */

    public double accept(Visitor visitor) {
        return visitor.interesUtilizado(this);
    }


    /* Getters and Setters */

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
}

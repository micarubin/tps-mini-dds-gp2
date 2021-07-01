package domain.Visitor;

public class CuentaCorriente implements Visitable {
    private double montoTotal;

    /* Methods */

    public double accept(Visitor visitor) {
        return visitor.interesUtilizado(this);
    }

    /* Getters and Setters */

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
}

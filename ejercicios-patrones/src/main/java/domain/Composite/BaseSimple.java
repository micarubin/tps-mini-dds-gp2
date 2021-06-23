package domain.Composite;

public class BaseSimple extends Base {
    private int cantAmbulancias;
    private float tiempoMedioDeAsist;

    /* Constructor */

    public BaseSimple(int cantBases, float tiempoMedioDeAsist) {
        this.cantAmbulancias = cantBases;
        this.tiempoMedioDeAsist = tiempoMedioDeAsist;
    }

    /* Getters and Setters */

    public int getCantAmbulancias() {
        return cantAmbulancias;
    }

    public void setCantAmbulancias(int cantAmbulancias) {
        this.cantAmbulancias = cantAmbulancias;
    }

    public float getTiempoMedioDeAsist() {
        return tiempoMedioDeAsist;
    }

    public void setTiempoMedioDeAsist(float tiempoMedioDeAsist) {
        this.tiempoMedioDeAsist = tiempoMedioDeAsist;
    }
}

package domain.bussines;

public enum Periodicidad {
    UNICA_VEZ(0),
    SEMANAL(7),
    MENSUAL(30);

    private int valorEnDias;
    private Periodicidad(int valorEnDias){
        this.valorEnDias = valorEnDias;
    }

    public static Periodicidad fromInteger(int periodo) {
        switch(periodo) {
            case 0:
                return UNICA_VEZ;
            case 1:
                return SEMANAL;
            case 2:
                return MENSUAL;
        }
        return null;
    }

    public int getValorEnDias() {
        return valorEnDias;
    }
    public int getPeriodicidad() {
        Periodicidad periodicidad = Periodicidad.UNICA_VEZ; // Or whatever
        return periodicidad.getValorEnDias();
    }
}

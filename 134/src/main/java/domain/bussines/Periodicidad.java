package domain.bussines;

public enum Periodicidad {
    UNICA_VEZ(0,0),
    SEMANAL(7,1),
    MENSUAL(30,2);

    private int valorEnDias;
    private int valorMenu;
    private Periodicidad(int valorEnDias, int valorMenu){
        this.valorEnDias = valorEnDias;
        this.valorMenu = valorMenu;
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

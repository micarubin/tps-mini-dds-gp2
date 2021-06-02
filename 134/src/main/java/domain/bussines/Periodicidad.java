package domain.bussines;

public enum Periodicidad {
    UNICA_VEZ,
    SEMANAL,
    MENSUAL;

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
}

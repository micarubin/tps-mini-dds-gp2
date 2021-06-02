package domain.bussines;

public enum TipoArticulo {
    TUBO,
    PIEZA_AUTOMOVIL;

    public static TipoArticulo fromInteger(int tipoArticulo) {
        switch(tipoArticulo) {
            case 0:
                return TUBO;
            case 1:
                return PIEZA_AUTOMOVIL;
        }
        return null;
    }
}

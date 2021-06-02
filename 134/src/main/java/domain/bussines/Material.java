package domain.bussines;

public enum Material {
    ACERO,
    ALUMINIO;

    public static Material fromInteger(int material) {
        switch(material) {
            case 0:
                return ACERO;
            case 1:
                return ALUMINIO;
        }
        return null;
    }
}

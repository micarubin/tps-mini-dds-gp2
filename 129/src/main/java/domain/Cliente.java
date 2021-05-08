package domain;

import java.util.List;

public class Cliente {
    public String nombre;
    public Integer dni;
    public List<Cuenta> cuentas;

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

}

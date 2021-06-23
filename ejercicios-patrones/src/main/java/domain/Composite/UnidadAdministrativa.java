package domain.Composite;

import java.util.List;

public class UnidadAdministrativa extends Base {
    private List<Base> bases;

    /* Constructor */

    public UnidadAdministrativa(List<Base> bases) {
        this.bases = bases;
    }

    /* Getters and Setters */

    public List<Base> getBases() {
        return bases;
    }

    public void setBases(List<Base> bases) {
        this.bases = bases;
    }

    /* Methods */

    public int getCantAmbulancias(){
        return this.bases.stream().mapToInt(base -> base.getCantAmbulancias()).sum();
    }
}

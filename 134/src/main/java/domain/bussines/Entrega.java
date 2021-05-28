package domain.bussines;

import java.time.LocalDateTime;
import java.util.List;

public class Entrega {
    private LocalDateTime fecha;
    private Periodicidad periodo;
    private List<Articulo> articulos;

    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);
    }

    public void envasar(){
        System.out.println("El articulo fue evasado");
    }
}

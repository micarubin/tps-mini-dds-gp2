package domain.Observer;

public class Bateria {
    private boolean conectado;
    private boolean cargando;
    private int carga;
    private int tiempo;
    private List<Oberver> observadores;

    public void notificar(){
        observadores.forEach(ob-> ob.uptadate());

    }
}



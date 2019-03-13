
package jugadores;


public final class Defensa extends Jugador {
    private int targetas;
    private int barrida;

    public Defensa() {
        super();
    }

    public Defensa(String nombre) {
        super(nombre);
    }

    public Defensa(String nombre, int edad, boolean derecho,String nacionalidad) {
        super(nombre, edad, derecho,nacionalidad);
    }

    public int getTargetas() {
        return targetas;
    }

    public void setTargetas(int targetas) {
        this.targetas = targetas;
    }

    public int getBarrida() {
        return barrida;
    }

    public void setBarrida(int barrida) {
        this.barrida = barrida;
    }

    @Override
    public String toString() {
        return super.toString()+ "Defensa{" + "targetas=" + targetas + ", barrida=" + barrida + '}';
    }
    
    
}

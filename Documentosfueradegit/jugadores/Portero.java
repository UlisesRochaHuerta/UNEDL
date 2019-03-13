package jugadores;

public final class Portero extends Jugador {
    private int atajadas;
    private Float despeje;

    public Portero() {
        super();
    }

    public Portero(String nombre) {
        super(nombre);
    }

    public Portero(String nombre, int edad, boolean derecho,String nacionalidad) {
        super(nombre, edad, derecho,nacionalidad);
    }

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    public double getDespeje() {
        return despeje;
    }

    public void setDespeje(Float despeje) {
        this.despeje = despeje;
    }

   

    @Override
    public String toString() {
        return super.toString()+ "Portero{" + "atajadas=" + atajadas + ", despeje=" + despeje + '}';
    }
    
    
}

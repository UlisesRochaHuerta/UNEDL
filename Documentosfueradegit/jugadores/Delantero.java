
package jugadores;


public final class Delantero extends Jugador {
    private boolean titular;
    private int goles;

    public Delantero() {
        
        super();
    }

    public Delantero(String nombre) {
        super(nombre);
    }

    public Delantero(String nombre, int edad, boolean derecho,String nacionalidad) {
        super(nombre, edad, derecho,nacionalidad);
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return super.toString()+"Delantero{" + "titular=" + titular + ", goles=" + goles + '}';
    }
    
    
    
   
    
    
}

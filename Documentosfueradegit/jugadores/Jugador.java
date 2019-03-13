
package jugadores;

public abstract class Jugador extends Persona{
protected int numJugador;
protected String club;

    public Jugador(){
        super();
    }

    public Jugador(String nombre) {
        super(nombre);
    }

    public Jugador(String nombre, int edad, boolean derecho,String nacionalidad) {
        super(nombre, edad, derecho,nacionalidad);
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return super.toString()+ "Jugador{" + "numJugador=" + numJugador + ", club=" + club + '}';
    }

   

   
 
}

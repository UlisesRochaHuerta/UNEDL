
package jugadores;


public final class Entrenador extends Persona{
    private boolean ex;
    private int campionatos;

    public Entrenador() {
    super();
    }

    public Entrenador(String nombre) {
        super(nombre);
    }

    public Entrenador(String nombre,String nacionalidad ,int edad, boolean derecho) {
        super(nombre, edad, derecho,nacionalidad);
    }

    public boolean isEx() {
        return ex;
    }

    public void setEx(boolean ex) {
        this.ex = ex;
    }

    public int getCampionatos() {
        return campionatos;
    }

    public void setCampionatos(int campionatos) {
        this.campionatos = campionatos;
    }

    @Override
    public String toString() {
        return super.toString()+ "Entrenador{" + "ex=" + ex + ", campionatos=" + campionatos + '}';
    }
    
    
    
}

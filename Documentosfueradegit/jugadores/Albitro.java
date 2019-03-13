package jugadores;


public final class Albitro extends Persona {
    private String posicion;
    private String genero;
    private boolean Ciego;
    private int TargetasAmarillas;
    private int TargetasRojas;
    private Object id;
    
    public Albitro() {
        super();
    }
    public Albitro(String nombre) {
        super(nombre);
    }
    public Albitro(String nombre, int edad, boolean derecho,String nacionalidad) {
        super(nombre, edad, derecho,nacionalidad);
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+"Albitro{" + "posicion=" + posicion + ", genero=" + genero + '}';
    }
    public Object getId() {
        return id;
    }
    public void setCiego(boolean parseBoolean) {
        this.Ciego = parseBoolean;
    }
    public void setTargetasAmarillas(int parseInt) {
        this.TargetasAmarillas = parseInt;
    }
    public void setTargetasRojas(int trijas) {
        this.TargetasRojas = trijas;
    }

}

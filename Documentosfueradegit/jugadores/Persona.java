package jugadores;
import java.util.*;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected boolean derecho;
    protected String nacionalidad;
    protected String Id;
    protected String Genero;
    
    public Persona() {
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad, boolean derecho,String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.derecho = derecho;
        this.nacionalidad= nacionalidad;   }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public boolean isDerecho() {
        return derecho;
    }
    public void setDerecho(boolean derecho) {
        this.derecho = derecho;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", derecho=" + derecho + ", nacionalidad=" + nacionalidad + '}';
    }

    public void setId(String id) {
        this.Id = id;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setGenero(String s) {
        this.Genero = s;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}

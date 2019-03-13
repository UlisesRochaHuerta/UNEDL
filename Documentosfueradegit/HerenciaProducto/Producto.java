package HerenciaProducto;
import java.util.*;
public abstract class Producto {
    protected String cad;
    protected int lote;
    protected String pais;
    protected String fecha;
    protected String temp;

    public Producto() {
    }

    public Producto(int lote) {
        this.lote = lote;
    }

    public Producto(String cad, int lote, String pais, String fecha, String temp) {
        this.cad = cad;
        this.lote = lote;
        this.pais = pais;
        this.fecha = fecha;
        this.temp = temp;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.lote;
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
        final Producto other = (Producto) obj;
        if (this.lote != other.lote) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Producto{" + "cad=" + cad + ", lote=" + lote + ", pais=" + pais + ", fecha=" + fecha + ", temp=" + temp + '}';
    }


    

    


}
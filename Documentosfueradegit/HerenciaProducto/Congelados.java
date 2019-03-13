package HerenciaProducto;
public abstract class Congelados extends Producto {

    public Congelados() {
        super();
    }

    public Congelados(int lote) {
        super(lote);
    }

    public Congelados(String cad, int lote, String pais, String fecha, String temp) {
        super(cad, lote, pais, fecha, temp);
    }

    @Override
    public String toString() {
        return super.toString()+ "Congelados{" + '}';
    }
    
    
    
    
    
}

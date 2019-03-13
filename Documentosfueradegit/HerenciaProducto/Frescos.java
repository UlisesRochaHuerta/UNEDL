package HerenciaProducto;
public final class Frescos extends Producto {

    public Frescos() {
        super();
        
    }

    public Frescos(int lote) {
        super(lote);
    }

    public Frescos(String cad, int lote, String pais, String fecha, String temp) {
        super(cad, lote, pais, fecha, temp);
    }



    @Override
    public String toString() {
        return super.toString()+ "Frescos{" + '}';
    }
    


   
    

    
    
}

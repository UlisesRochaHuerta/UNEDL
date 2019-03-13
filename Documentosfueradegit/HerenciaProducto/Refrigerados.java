package HerenciaProducto;
public final class Refrigerados extends Producto {
    protected String codSup;

    public Refrigerados() {
        super();
    }

    public Refrigerados(int lote) {
        super(lote);
    }

    public Refrigerados(String cad, int lote, String pais, String fecha, String temp) {
        super(cad, lote, pais, fecha, temp);
    }

    public String getCodSup() {
        return codSup;
    }

    public void setCodSup(String codSup) {
        this.codSup = codSup;
    }

    @Override
    public String toString() {
        return super.toString()+ "Refrigerados{" + "codSup=" + codSup + '}';
    }
    
    
    
    
    
}

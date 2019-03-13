package HerenciaProducto;
public final class Nitrogeno extends Congelados {
    private int tiempo;
    private String info;

    public Nitrogeno() {
        super();
    }

    public Nitrogeno(int lote) {
        super(lote);
    }

    public Nitrogeno(int tiempo, String info, String cad, int lote, String pais, String fecha, String temp) {
        super(cad, lote, pais, fecha, temp);
        this.tiempo = tiempo;
        this.info = info;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return super.toString()+"Nitrogeno{" + "tiempo=" + tiempo + ", info=" + info + '}';
    }
    
    
    
    
}

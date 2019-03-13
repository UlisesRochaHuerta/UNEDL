package HerenciaProducto;

public final class Aire extends Congelados {
    private double nitrogeno;
    private double oxigeno;
            private double dioCar;
            private double vapAgua;

    public Aire() {
        super();
        
    }

    public Aire(int lote) {
        super(lote);
    }


    public Aire(double nitrogeno, double oxigeno, double dioCar, double vapAgua, String cad, int lote, String pais, String fecha, String temp) {
        super(cad, lote, pais, fecha, temp);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioCar = dioCar;
        this.vapAgua = vapAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioCar() {
        return dioCar;
    }

    public void setDioCar(double dioCar) {
        this.dioCar = dioCar;
    }

    public double getVapAgua() {
        return vapAgua;
    }

    public void setVapAgua(double vapAgua) {
        this.vapAgua = vapAgua;
    }

    @Override
    public String toString() {
        return super.toString()+"Aire{" + "nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioCar=" + dioCar + ", vapAgua=" + vapAgua + '}';
    }
    
            
            
    
    
}

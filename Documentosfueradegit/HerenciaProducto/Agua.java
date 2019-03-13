package HerenciaProducto;

public final class Agua extends Congelados{
    private double sal;
    private double agua;

    public Agua() {
        super();
    }

    public Agua(int lote) {
        super(lote);
    }

    public Agua(double sal, double agua, String cad, int lote, String pais, String fecha, String temp) {
        super(cad, lote, pais, fecha, temp);
        this.sal = sal;
        this.agua = agua;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    @Override
    public String toString() {
        return super.toString() + "Agua{" + "sal=" + sal + ", agua=" + agua + '}';
    }
    
    
    
    
    
}

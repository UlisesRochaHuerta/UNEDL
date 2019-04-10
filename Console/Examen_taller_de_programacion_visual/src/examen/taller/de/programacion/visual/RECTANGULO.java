package examen.taller.de.programacion.visual;

/**
 * @author Ulises
 */
public class RECTANGULO {
    private static double AREATOTAL;    
    private static double BASE;
    private static double ALTURA;


    public RECTANGULO() {
    }
    
    public RECTANGULO(double base, double altura) {
        this.BASE = base;
        this.ALTURA = altura;
    }

    public double getBASE() {
        return BASE;
    }

    public void setBASE(double BASE) {
        this.BASE = BASE;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public void setALTURA(double ALTURA) {
        this.ALTURA = ALTURA;
    }

    public static double getAREATOTAL() {
        return AREATOTAL;
    }

    public static void setAREATOTAL(double AREATOTAL) {
        RECTANGULO.AREATOTAL = AREATOTAL;
    }

    public static double CALCULAR_AREA() {
        AREATOTAL = BASE * ALTURA;
        return AREATOTAL;
    }

}

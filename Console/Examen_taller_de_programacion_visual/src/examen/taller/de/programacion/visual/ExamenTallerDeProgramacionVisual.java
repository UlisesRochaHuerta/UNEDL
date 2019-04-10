package examen.taller.de.programacion.visual;

import java.util.Scanner;

/**
 * @author Ulises
 */
public class ExamenTallerDeProgramacionVisual {
    public static void main(String[] args) {
        Scanner ESCANEAR = new Scanner(System.in);
        RECTANGULO RCTNGL;
        System.out.print("\nCUANTO MIDE LA ALTURA DEL RECTANGULO? : ");
        double ALTURA = ESCANEAR.nextDouble();
        System.out.print("\nCUANTO MIDE LA BASE DEL RECTANGULO? : ");
        double BASE = ESCANEAR.nextDouble();
        RCTNGL = new RECTANGULO(BASE, ALTURA);
        System.out.print("\n\nCUANTO CUESTA POR METRO CUADRADO? : ");
        double costo = ESCANEAR.nextDouble();
        RCTNGL.CALCULAR_AREA();
        System.out.println("\n\nEL COSTO TOTAL ES: $" + MESA.CALCULAR(costo)+ " Pesos");
        System.out.println("\nGENIAL\nEL AREA DE LA MESA ES:  :"+RCTNGL.getAREATOTAL()+"mt Cuarados");
        System.out.println("\n\n\n\n\n\n\tULISES ISAAC ROCHA HUERTA");
    }
}
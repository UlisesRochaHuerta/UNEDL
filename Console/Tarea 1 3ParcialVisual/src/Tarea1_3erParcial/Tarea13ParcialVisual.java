package Tarea1_3erParcial;
import java.util.Scanner;
/**
 * @author Ulises
 */
public class Tarea13ParcialVisual {
    public static Scanner escan = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.print("Ingresa el tamaño del Array: ");
        int size=escan.nextInt();
            while((size<=1)||(size>689)){
                System.out.println("\nError, ingresaste el numero "+size);
                System.out.print("Ingresa el tamaño del Array: ");
                size=escan.nextInt();    
            }
        int[] numeros = new int[size];
    System.out.println("\nEstos son tu numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i+1;
            System.out.print(" "+numeros[i]+"  ");
        }
    System.out.println("\n\n");
    System.out.print("Ingresa el numero de Iteraciones: ");
        int n=escan.nextInt();
        int primero = numeros[0];
        int x;
            for(x = 0; x<numeros.length-1; x++){
                numeros[x] = numeros[x+1];
            }
    numeros[x]= primero;
        for(x=0;x<(n-1);x++){
            rotar(numeros);
        }
    System.out.println("Tus numeros se recorrieron "+n+" posiciones a la izquierda...");
        for (x = 0; x<numeros.length; x++) {
            System.out.print(" "+numeros[x]+" ");
        }
        System.out.println(" \n");
    }

    public static int[] rotar(int[] numeros){
    int primero = numeros[0];
    int x;
    for(x= 0; x<numeros.length-1; x++)
        numeros[x] = numeros[x+1]; 
    numeros[x]= primero;
  return numeros;
}
    
}
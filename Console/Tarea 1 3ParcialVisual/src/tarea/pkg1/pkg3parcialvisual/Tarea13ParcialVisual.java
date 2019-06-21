package tarea.pkg1.pkg3parcialvisual;
import java.util.Scanner;

/**
 * @author Ulises
 */
public class Tarea13ParcialVisual {
    public static Scanner escan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresa el tamaño del Array: ");
        int size=escan.nextInt();
                        int[] numeros = new int[size];
//RECIBE DATOS
        System.out.println(" || INGRESE LOS NUMEROS || ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero "+(i+1)+" : ");
            numeros[i]=escan.nextInt();
        }
//Muestra datos obtenidos
        System.out.println("eSTOS SON LOS NUMEROS QUE PUDE RECIBIR : ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }   
        
        quickSort(numeros, 0, numeros.length - 1);//manda llamar al metodo
        System.out.println("\nVector Ordenado");
        for (int n : numeros) {
            System.out.print(n + " ");//escribe los datos ordenados
        }
        
    }
    
    public static void quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
    
}

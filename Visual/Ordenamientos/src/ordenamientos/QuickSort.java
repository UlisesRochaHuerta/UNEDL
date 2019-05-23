package ordenamientos;

import java.util.Random;

/**
 * @author Ulises
 */
public class QuickSort {

public static void main(String[] args) {
        int[] numeros = new int[8];
        //Random rnd = new Random();
        numeros[0]=23;
        numeros[1]=31;
        numeros[2]=13;
        numeros[3]=17;
        numeros[4]=41;
        numeros[5]=16;
        numeros[6]=27;
        numeros[7]=5;
        
        System.out.println("Vector desordenado");
        for (int i = 0; i < numeros.length; i++) {
            //numeros[i] = rnd.nextInt(50);
            System.out.print(numeros[i] + " ");
        }   
        QuickSort.quickSort(numeros, 0, numeros.length - 1);
        System.out.println("\nVector Ordenado");
        for (int n : numeros) {
            System.out.print(n + " ");
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

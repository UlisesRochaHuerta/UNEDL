package Tarea1_3erParcial;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ulises
 * Ingresa el tamaño del Array: 6
 || INGRESE LOS NUMEROS || 
Numero 1 : 2
Numero 2 : 6
Numero 3 : 3
Numero 4 : 7
Numero 5 : 4
Numero 6 : 8
eSTOS SON LOS NUMEROS QUE PUDE RECIBIR : 
2 6 3 7 4 8
Vector Ordenado
2 3 4 6 7 8
Ingresa el numero del cual empezar: 4
[4, 6, 7, 8, 2, 3]
[6, 7, 8, 2, 3, 4]
[7, 8, 2, 3, 4, 6]
[8, 2, 3, 4, 6, 7]
[2, 3, 4, 6, 7, 8]
[3, 4, 6, 7, 8, 2]
 */
public class formulax {
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
        System.out.println("\n\n\n");
        
        System.out.println("Ingresa el numero del cual empezar");
        int n=escan.nextInt();
        int primero = numeros[0];
        int x;
        for(x = 0; x<numeros.length-1; x++){
            numeros[x] = numeros[x+1];
        }
        numeros[x]= primero;
        for (x = 0; x<numeros.length; x++) {
            //imprimir array
            rotar(numeros);
            System.out.println(""+Arrays.toString(numeros));
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
    
    
    public static int[] rotar(int[] numeros){
  int primero = numeros[0];
  int x;
 
  for(x= 0; x<numeros.length-1; x++)
    numeros[x] = numeros[x+1];
 
  numeros[x]= primero;
 
  return numeros;
}
}

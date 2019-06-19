package tpv2doparcial;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Ulises
 */
public class TPV2doParcial {
public static Scanner escan = new Scanner(System.in);
    public static void main(String[] args) {
                int[] numeros = new int[10];
//RECIBE DATOS
        System.out.println(" || INGRESE 10 NUMEROS DESORDENADOS, AHORITA LOS VAMOS A ORDENAR || ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero "+(i+1)+" : ");
            numeros[i]=escan.nextInt();
        }
//Muestra datos obtenidos
        System.out.println("Vector desordenado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }   
        
        quickSort(numeros, 0, numeros.length - 1);//manda llamar al metodo
        System.out.println("\nVector Ordenado");
        for (int n : numeros) {
            System.out.print(n + " ");//escribe los datos ordenados
        }
        
        String cadena1 = Integer.toString(numeros[0]);
        String cadena2 = Integer.toString(numeros[1]);
        String cadena3 = Integer.toString(numeros[2]);
        String cadena4 = Integer.toString(numeros[3]);
        String cadena5 = Integer.toString(numeros[4]);
        String cadena6 = Integer.toString(numeros[5]);
        String cadena7 = Integer.toString(numeros[6]);
        String cadena8 = Integer.toString(numeros[7]);
        String cadena9 = Integer.toString(numeros[8]);
        String cadena10 = Integer.toString(numeros[9]);
        
        try {
                    try (FileWriter fichero = new FileWriter("archivo.txt")) {
                        fichero.write(cadena1);
                        fichero.write("   ");
                        fichero.write(cadena2);
                        fichero.write("   ");
                        fichero.write(cadena3);
                        fichero.write("   ");
                        fichero.write(cadena4);
                        fichero.write("   ");
                        fichero.write(cadena5);
                        fichero.write("   ");
                        fichero.write(cadena6);
                        fichero.write("   ");
                        fichero.write(cadena7);
                        fichero.write("   ");
                        fichero.write(cadena8);
                        fichero.write("   ");
                        fichero.write(cadena9);
                        fichero.write("   ");
                        fichero.write(cadena10);
                    }
                System.out.println("\n\n\tArchivo guardado");
            } catch (IOException ex) {
                System.out.println("No se pudo guardar el archivo, pero se ordenar su contenido");
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
    


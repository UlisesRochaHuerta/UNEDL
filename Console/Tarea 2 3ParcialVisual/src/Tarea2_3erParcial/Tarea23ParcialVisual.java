package Tarea2_3erParcial;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Ulises
 */

public class Tarea23ParcialVisual {
    public static Scanner leer=new Scanner(System.in);
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //int[] array = new int[] {1,0,1,0,1,1,0};
        int[] array =new int[7];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa los numeros, solo uno o cero... :");
            array[i]=leer.nextInt();
        }
        
    // Primer pase, recorrer los numeros que son cero a la izquierda.
    int variablecero = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] != 1) {
            if (i != variablecero) {
                array[variablecero] = array[i];
            }
            variablecero++;
        }
    }
    // Segundo pase, llenar el resto del array con ceros.
    for (int i = variablecero; i < array.length; i++) {
        array[i] = 1;
    }
    System.out.println(Arrays.toString(array));
    }
}
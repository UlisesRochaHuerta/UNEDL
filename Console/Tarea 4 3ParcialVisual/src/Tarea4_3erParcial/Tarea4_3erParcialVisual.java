package Tarea4_3erParcial;

import java.util.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author Ulises
 */
public class Tarea4_3erParcialVisual {

    public static Scanner escan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite la cantidad del arreglo");
        int cantidad = escan.nextInt();
        int array[] = new int[cantidad];
        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese un valor");
            array[i] = escan.nextInt();
        }
        System.out.println("Digite la posición inicial");
        int pInicial = escan.nextInt();
        System.out.println("Digite la posición final");
        int pFinal = escan.nextInt();
        System.out.println("Digite el numero a sumar");
        int numdesuma = escan.nextInt();
        int resta = pFinal - pInicial;
        for (int i = pInicial; i <= pFinal; i++) {
            array[i] = array[i] + numdesuma;
        }
        System.out.println(" " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(" " + array[cantidad - 1]);

    }
}

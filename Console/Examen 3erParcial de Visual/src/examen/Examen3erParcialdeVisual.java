package examen;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Ulises
 */
public class Examen3erParcialdeVisual {
public static Scanner escan = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.print("Ingrese la cantidad de dinero: ");
        //int cant=escan.nextInt();
        int cant=Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingresa la cantidad Disponible de dinero: "));
        
        //System.out.print("Ingrese cantidad de precios: ");
        //int precios=escan.nextInt();
        int precios=Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingresa la cantidad de Articulos posibles a una compra con "
                +cant+" pesos"));
        
        int[] numeros = new int[precios];
        
        for(int x=0;x<numeros.length;x++){
            //System.out.print("ingrese valor en la posicion "+(x+1)+ ": " );
            //numeros[x]=escan.nextInt();
            
            numeros[x]=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Ingrese precio del articulo numero "+(x+1)+" : "));
        }
        
        
        int temp=0,aux=0;
        for(int x=0;x<numeros.length;x++){
            temp = cant-numeros[x];
            if((temp<cant) && (temp>0) ){
                aux++;
            }
        }
        
        for(int x=0;x<numeros.length;x++){
            System.out.print(" "+numeros[x]);//imprime valores ingresados
        }
        
        //System.out.print("resultado: "+(aux-1));
        JOptionPane.showMessageDialog(null,""+
                "La cantidad de articulos que puedes comprar"
                + " con "+cant+" pesos es: "+aux);
        
        
}
    
}
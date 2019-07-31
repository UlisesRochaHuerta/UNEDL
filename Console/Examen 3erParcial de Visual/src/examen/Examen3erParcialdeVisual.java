package examen;

import java.util.Scanner;

/**
 * @author Ulises
 */
public class Examen3erParcialdeVisual {
public static Scanner escan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de dinero:");
        int cant=escan.nextInt();
        
        System.out.print("ingrese cantidad de precios:");
        int precios=escan.nextInt();
        
        
        int[] numeros = new int[precios];
        for(int x=0;x<numeros.length;x++){
            System.out.print("ingrese valor en la posicion "+(x+1)+ ": " );
            numeros[x]=escan.nextInt();
        }
        
        
        int temp=0,aux=1;
        for(int x=0;x<numeros.length;x++){
            temp = cant-numeros[x];
            if((temp<cant) &&(temp>0) ){
                aux++;
            }
        }
        
        System.out.print("resultado: "+(aux-1));
        
}
    
}
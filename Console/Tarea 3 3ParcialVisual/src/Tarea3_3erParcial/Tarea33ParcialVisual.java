package Tarea3_3erParcial;

import java.util.Scanner;

/**
 * @author Ulises
 */
public class Tarea33ParcialVisual {
        public static Scanner teclado=new Scanner(System.in);
        public static int tam1,tam2;
    public static void main(String[] args) {
        System.out.println("\t\nIngrese el tamaño del arreglo 1: ");
        tam1=teclado.nextInt();
        String[] array1 =new String[tam1];
        for (int n = 0; n < array1.length ; n++) {
            System.out.print("Ingrese texto para guardar en la posicion "+(n+1)+" del arreglo: ");
            array1[n]=teclado.next();
        }
        
        System.out.println("\t\nIngrese el tamaño del arreglo 2: ");
        tam2=teclado.nextInt();
        String[] array2 =new String[tam2];
        for (int n = 0; n < array2.length ; n++) {
            System.out.print("Ingrese texto para guardar en la posicion "+(n+1)+" del arreglo: ");
            array2[n]=teclado.next();
        }
        
        String[] nom = new String[10];
        for(int n=0;n<array1.length;n++){
            nom[n]=array1[n];
        }
        for(int n=0;n<array1.length;n++){
        if(nom[n].equals(array1[n])){
           System.out.println(array1[n]+ "dato encontrado en la posicion: "+(n+1));
        }
        }
        
        //imprime contenido de array1
        for (int n = 0; n < array1.length ; n++) {
            System.out.print(array1[n]+", ");
        }
        //imprime contenido de array2
        for (int n = 0; n < array2.length ; n++) {
            System.out.print(array2[n]+", ");
        }
    
    }

    public static void thread(){
                Scanner teclado=new Scanner(System.in);
    String [] nombres = {"johan","juan","ana","jazmin"};
    String nom;
 
     System.out.print("ingrese un nombre: ");
     nom = teclado.next();
 
    for(int n=0;n<nombres.length;n++){
        if(nom.equals(nombres[n])){
           System.out.println("dato encontrado en la posicion: "+(n+1));
        }
      }
    }
    
}

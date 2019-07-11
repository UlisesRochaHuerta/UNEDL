package Tarea3_3erParcial;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author Ulises
 */
public class ArregloOcurrencia {
        public static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
    String[] arreglo1;
    String[] arreglo2;
System.out.print("Digite la cantidad del primer arreglo: ");
    int tamaño1 = teclado.nextInt();
System.out.print("Digite la cantidad del segundo arreglo: ");
    int tamaño2 = teclado.nextInt();

    arreglo1= new String[tamaño1];
    arreglo2= new String[tamaño2];
System.out.println("\n\tLlenaremos el primer arreglo...");
for(int i=0;i<arreglo1.length;i++){
    System.out.print("Escribe un texto: ");
    arreglo1[i]=teclado.next();
    }

System.out.println("\n\tLlenaremos el segundo arreglo...");
for(int i=0;i<arreglo2.length;i++){
    System.out.print("Escribe un texto: ");
    arreglo2[i]=teclado.next();
    }

    HashMap<String,Integer>map=new HashMap<>();
int contador1=0;
    for(String word:arreglo1){
        if(map.containsKey(word)){
            contador1=map.get(word);
                map.put(word,contador1+1);
        }else{
            map.put(word,1);
        }
    }
    String contleters1 = "";
    for(Map.Entry<String,Integer>var:map.entrySet()) {
        contleters1=contleters1+var.getKey()+" aparece "+var.getValue().toString()+" vez en el arreglo\n";
    }
        System.out.println("\nVeces que aparece en el ''array1'' \n\n"+contleters1);

        
    HashMap<String,Integer>map2=new HashMap<>();
int contador2=0;
    for(String word:arreglo2){
        if(map2.containsKey(word)){
            contador2=map2.get(word);
                map2.put(word,contador2+1);
        }else{
            map2.put(word,1);
        }
    }
    String conletters2 = "";
    for(Map.Entry<String,Integer>var:map2.entrySet()){
        conletters2=conletters2+var.getKey()+" : "+var.getValue().toString()+"\n";
    }
        System.out.println("\nVeces que aparece en el ''array2'' \n\n"+conletters2);
        
    }
}

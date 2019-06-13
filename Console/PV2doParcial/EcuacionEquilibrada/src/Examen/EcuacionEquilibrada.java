package Examen;

/**
 *
 * @author Ulises
 */
import java.util.Stack;

public class EcuacionEquilibrada {

    private String cadena;
    private Stack<Character> array = new Stack<Character>();

    public EcuacionEquilibrada(String cadena) {
        this.cadena = cadena;
    }

    public boolean equilibrada() {
        char letras[] = cadena.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == '(') {
                array.push('(');

            } else if (letras[i] == '{') {
                array.push('{');
                
            } else if (letras[i] == '[') {
                array.push('[');
                
            } else if (letras[i] == ')') {
                if (!array.empty()&& array.pop()!=')') {
                    array.pop();
                }

            } else if (letras[i] == '}') {
                if (!array.empty()&& array.pop()!='{') {
                   array.pop();
                }

            } else if (letras[i] == ']') {
                if (!array.empty()&& array.pop()!='[') {
                   array.pop();
                }

            }
            if(array.empty()){
                return false;
            }
            else{
                return true;
            }
        }
        return array.empty();
    }

    public static void main(String[] args) {
        EcuacionEquilibrada p = new EcuacionEquilibrada(" ( { ) { } ( { ( ) } ");
        EcuacionEquilibrada p2 = new EcuacionEquilibrada(" { ( ) { ( ( ( ) ) } ");
        EcuacionEquilibrada p3 = new EcuacionEquilibrada("{ ( ) ( ) } { ( ) } ");

        System.out.println(p.equilibrada());
        System.out.println(p2.equilibrada());
        System.out.println(p3.equilibrada());
        if(p.equilibrada()==false){
            System.out.println(" ( { ) { } ( { ( ) } "+" ... ESTA DESEQUILIBRADA");
        } else {
            System.out.println(" ( { ) { } ( { ( ) } "+" ... ESTA EQUILIBRADA");
        }
        
        if(p2.equilibrada()==false){
            System.out.println(" { ( ) { ( ( ( ) ) } "+" ... ESTA DESEQUILIBRADA");
        } else {
            System.out.println(" { ( ) { ( ( ( ) ) } "+" ... ESTA EQUILIBRADA");
        }
        
        if(p3.equilibrada()==false){
            System.out.println("{ ( ) ( ) } { ( ) } "+" ... ESTA DESEQUILIBRADA");
        } else {
            System.out.println("{ ( ) ( ) } { ( ) } "+" ... ESTA EQUILIBRADA");
        }
        
    }

}

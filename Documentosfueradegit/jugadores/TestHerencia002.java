package jugadores;
import java.util.*;
public class TestHerencia002 {
public static void main(String arg[]) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        Entrenador entrenador = new Entrenador();
        Albitro arbitro = new Albitro();
        Delantero delantero = new Delantero();
       Defensa  defensa = new Defensa();
        Portero portero = new Portero();
        int opc = 0, opc2 = 0;

        do {
            System.out.println("que puesto es?");
            System.out.println("1)Arbitro \n 2)Entrenador\n 3)Jugador  \n 0)salir");
            opc = teclado.nextInt();
            
            switch (opc) {
                case 1:
                    
                    System.out.println("Arbitro");
                    System.out.println("cual es su nombre");
                    arbitro.setNombre(teclado.next());
                    System.out.println("Edad");
                    arbitro.setEdad(teclado.nextInt());
                    System.out.println("cual es su nacionalidad");
                    arbitro.setNacionalidad(teclado.next());
                    System.out.println("es derecho?(true o false)");
                    arbitro.setDerecho(teclado.nextBoolean());
                    System.out.println("es hombre o mujer");
                    arbitro.setGenero(teclado.next());
                    System.out.println("cual es la posicion del arbitro");
                    arbitro.setPosicion(teclado.next());
                    System.out.println(arbitro);
                    
                    break;
                case 2:
                    System.out.println("Entrenador");
                    System.out.println("cual es su nombre");
                    entrenador.setNombre(teclado.next());
                    System.out.println("Edad");
                    entrenador.setEdad(teclado.nextInt());
                    System.out.println("cual es su nacionalidad");
                    entrenador.setNacionalidad(teclado.next());
                    System.out.println("es derecho?(true o false)");
                    entrenador.setDerecho(teclado.nextBoolean());
                    System.out.println("cuantos camponatos lleva");
                    entrenador.setCampionatos(teclado.nextInt());
                    System.out.println("ex futbolista?(true o false)");
                    entrenador.setEx(teclado.nextBoolean());
                    System.out.println(entrenador);
                    break;
                case 3:
                    System.out.println("Jugador");
                    do {
                        System.out.println("que pocision de jugador es?");
                        System.out.println("1)Delantero\n 2)Defensa \n 3)Portero\n 0)salir");
                        opc2 = teclado.nextInt();
                        switch (opc2) {
                            case 1:
                                System.out.println("Delantero");
                    System.out.println("cual es su nombre");
                    delantero.setNombre(teclado.next());
                    System.out.println("Edad");
                    delantero.setEdad(teclado.nextInt());
                    System.out.println("cual es su nacionalidad");
                    delantero.setNacionalidad(teclado.next());
                    System.out.println("es derecho?(true o false)");
                    delantero.setDerecho(teclado.nextBoolean());
                    System.out.println("numero de camiseta");
                    delantero.setNumJugador(teclado.nextInt());
                    System.out.println("cual es el club ");
                    delantero.setClub(teclado.next());
                    System.out.println("cuantos goles lleva");
                    delantero.setGoles(teclado.nextInt());
                    System.out.println("es titular?(true o false) ");
                    delantero.setTitular(teclado.nextBoolean());
                    System.out.println(delantero);
                                
                                break;
                            case 2:
                                System.out.println("Defensa");
                    System.out.println("cual es su nombre");
                    defensa.setNombre(teclado.next());
                    System.out.println("Edad");
                    defensa.setEdad(teclado.nextInt());
                    System.out.println("cual es su nacionalidad");
                    defensa.setNacionalidad(teclado.next());
                    System.out.println("es derecho?(true o false)");
                    defensa.setDerecho(teclado.nextBoolean());
                    System.out.println("numero de camiseta");
                    defensa.setNumJugador(teclado.nextInt());
                    System.out.println("cual es el club ");
                    defensa.setClub(teclado.next());
                    System.out.println("barridas por partido");
                    defensa.setBarrida(teclado.nextInt());
                    System.out.println("numero de targetas acomuladas");
                    defensa.setTargetas(teclado.nextInt());
                    System.out.println(defensa);
                                            
                                break;
                            case 3:
                                 System.out.println("Portero");
                    System.out.println("cual es su nombre");
                    portero.setNombre(teclado.next());
                    System.out.println("Edad");
                    portero.setEdad(teclado.nextInt());
                    System.out.println("cual es su nacionalidad");
                    portero.setNacionalidad(teclado.next());
                    System.out.println("es derecho?(true o false)");
                    portero.setDerecho(teclado.nextBoolean());
                    System.out.println("numero de camiseta");
                    portero.setNumJugador(teclado.nextInt());
                    System.out.println("cual es el club ");
                    portero.setClub(teclado.next());
                    System.out.println("numero de atajadas por partido");
                    portero.setAtajadas(teclado.nextInt());
                    System.out.println("distancia promedio de despeje");
                   portero.setDespeje(teclado.nextFloat());
                   System.out.println(portero);
                                  
                              break;
                            default:
                          System.out.println("no es una opcion");

                        }
                    } while (opc2 != 0);
                    
                    
                    break;
                     default:
                          System.out.println("no es una opcion");
            }
        } while (opc != 0);

    }
    
    
}

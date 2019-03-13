package Herencia002.Polimorfismo;

import jugadores.Defensa;
import jugadores.Delantero;
import jugadores.Jugador;
import jugadores.Persona;
import jugadores.Portero;
import jugadores.Albitro;
import jugadores.Entrenador;
import javax.swing.JOptionPane;

public class Polimorfismo {
    Persona p;
    Defensa Def;
    Delantero del;
    Portero por;
    Albitro arb;
    Entrenador ent;
    public static void main(String[] args) {
        Polimorfismo tp = new Polimorfismo();
        tp.menu();
    }
    public void capturarDatosPersona() {
        p.setNombre(JOptionPane.showInputDialog("Introduzca el nombre"));
        p.setNacionalidad(JOptionPane.showInputDialog("Digite nacionalidad "));
        p.setDerecho(Boolean.parseBoolean(JOptionPane.showInputDialog("Digite si es derecho")));
        p.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
    }
    public void capturarDatosArbitro() {
        if (p instanceof Albitro) {
            arb = (Albitro) p;
            arb.setGenero(JOptionPane.showInputDialog("es hombre o mujer?"));
            arb.setPosicion(JOptionPane.showInputDialog("en que posicion se encuentra?"));
            p = null;
        }
    }
    public void capturarDatosEntrenador() {
        if (p instanceof Entrenador) {
            ent = (Entrenador) p;
            ent.setCampionatos(Integer.parseInt(JOptionPane.showInputDialog("cuantos campeonatos lleva")));
            ent.setEx(Boolean.parseBoolean(JOptionPane.showInputDialog("es ex jugador?")));
            p = null;
        }
    }
    public void capturarDatosJugador() {
        if (p instanceof Jugador) {
            Jugador j = (Jugador) p;
            j.setClub(JOptionPane.showInputDialog("Digite el equipo"));
            j.setNumJugador(Integer.parseInt(JOptionPane.showInputDialog("numero de camiseta")));
        }
    }
    public void capturarDatosDelantero() {
        if (p instanceof Delantero) {
            del = (Delantero) p;
            //del =(Delantero) p
            del.setGoles(Integer.parseInt(JOptionPane.showInputDialog("Digite los goles")));
            del.setTitular(Boolean.parseBoolean(JOptionPane.showInputDialog("es titular?")));
            p = null;
        }
    }
    public void capturarDatosDefensa() {
        if (p instanceof Defensa) {
            Def = (Defensa) p;
            Def.setBarrida(Integer.parseInt(JOptionPane.showInputDialog("Digite las barridas")));
            Def.setTargetas(Integer.parseInt(JOptionPane.showInputDialog("cuantas tagetas lleva?")));
            p = null;
        }
    }
    public void capturarDatosPortero() {
        if (p instanceof Portero) {
            por = (Portero) p;
            por.setAtajadas(Integer.parseInt(JOptionPane.showInputDialog("Digite las atajadas")));
            por.setDespeje(Float.parseFloat(JOptionPane.showInputDialog("metros de despeje")));
            p = null;
        }
    }

    public void imprimirArb() {
        JOptionPane.showMessageDialog(null, arb);
    }
    public void imprimirEnt() {
        JOptionPane.showMessageDialog(null, ent);
    }
    public void imprimirDef() {
        JOptionPane.showMessageDialog(null, Def);
    }
    public void imprimirDel() {
        JOptionPane.showMessageDialog(null, del);
    }
    public void imprimirPor() {
        JOptionPane.showMessageDialog(null, por);
    }

    public void menu() {
        String op, aux = null, op2;
        int res;
        do {
            op2 = JOptionPane.showInputDialog("que es lo que quiere hacer?"
                    + "\n0.salir"
                    + "\n1.Arbitro"
                    + "\n2.Entrenador"
                    + "\n3.Juagador");
            switch (op2) {
                case "0":
                    System.exit(0);
                    break;
                case "1":
                    p = new Albitro();
                    do {
                        res = Integer.parseInt(JOptionPane.showInputDialog("que quiere?"
                                + "1)llenar"
                                + "2)mostrar"
                                + "3)nada"));
                        if (res == 1) {
                            capturarDatosPersona();
                            capturarDatosArbitro();}
                        if (res==2) {
                            imprimirArb();
                        } 
                    } while (res != 3);
                    break;
                case "2":
                    p = new Entrenador();
                    do {
                        res = Integer.parseInt(JOptionPane.showInputDialog("que quiere?"
                                + "1)llenar"
                                + "2)mostrar"
                                + "3)nada"));
                        if (res == 1) {
                            capturarDatosPersona();
                            capturarDatosEntrenador();
                        }
                        if (res == 2) {
                            imprimirEnt();
                        } 
                    } while (res != 3);
                    break;
                case "3":
                    do {
                        op = JOptionPane.showInputDialog("0.Salir"
                                + "\n1. Delantero"
                                + "\n2. Defensa"
                                + "\n3. Portero");

                        switch (op) {
                            case "0":
                                System.exit(0);
                                break;
                            case "1":
                                p = new Delantero();
                                do {
                                    res = Integer.parseInt(JOptionPane.showInputDialog("que quiere?"
                                            + "1)llenar"
                                            + "2)mostrar"
                                            + "3)nada"));
                                    if (res == 1) {
                                        capturarDatosPersona();
                                        capturarDatosJugador();
                                        capturarDatosDelantero();
                                    }
                                    if (res == 2) {
                                        imprimirDel();
                                    } 
                                } while (res != 3);
                                break;
                            case "2":
                                p = new Defensa();
                                do {
                                    res = Integer.parseInt(JOptionPane.showInputDialog("que quiere?"
                                            + "1)llenar"
                                            + "2)mostrar"
                                            + "3)nada"));
                                    if (res == 1) {
                                        capturarDatosPersona();
                                capturarDatosJugador();
                                capturarDatosDefensa();
                                    }
                                    if (res == 2) {
                                        imprimirDef();
                                    } 
                                } while (res != 3);
                                break;
                            case "3":
                                p = new Portero();
                                do {
                                    res = Integer.parseInt(JOptionPane.showInputDialog("que quiere?"
                                            + "1)llenar"
                                            + "2)mostrar"
                                            + "3)nada"));
                                    if (res == 1) {
                                         capturarDatosPersona();
                                capturarDatosJugador();
                                capturarDatosPortero();
                                    }
                                    if (res == 2) {
                                        imprimirPor();
                                    } 
                                } while (res != 3);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No digito una opción correcta");
                        }
                    } while (true);
                default:
                    JOptionPane.showInputDialog(null, "no digito una opcion");
            }
        } while (true);
    }
}

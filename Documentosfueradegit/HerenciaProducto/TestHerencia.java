package HerenciaProducto;

import java.util.*;

public class TestHerencia {

    public static void main(String arg[]) {
        Scanner tecl;
        tecl = new Scanner(System.in);
        Frescos fresco = new Frescos();
        Refrigerados refrigerado = new Refrigerados();
        Agua agua = new Agua();
        Aire aire = new Aire();

        Nitrogeno nitro = new Nitrogeno();
        int opcion_uno = 0, opc2 = 0;

        do {
            System.out.println("que tipo de alimento es");
            System.out.println("1)frescos\n 2)Refrigerados\n 3)Congelados \n 0)salir");
            
            opcion_uno = tecl.nextInt();
            switch (opcion_uno) {
                case 1:
                    System.out.println("frescos");
                    System.out.println("cual es el lote?");
                    fresco.setLote(tecl.nextInt());
                    System.out.println("Fecha de caducidad?");
                    fresco.setCad(tecl.next());
                    System.out.println("fecha de envasado");
                    fresco.setFecha(tecl.next());
                    System.out.println("pais de origen");
                    fresco.setPais(tecl.next());
                    System.out.println(fresco);
                    break;
                case 2:
                    System.out.println("refrigerados");
                    System.out.println("cual es el lote?");
                    refrigerado.setLote(tecl.nextInt());
                    System.out.println("Fecha de caducidad?");
                    refrigerado.setCad(tecl.next());
                    System.out.println("codigo del organismo");
                    refrigerado.setCodSup(tecl.next());
                    System.out.println("temperatura de mantenimiento");
                    refrigerado.setTemp(null);
                    System.out.println("fecha de envasado");
                    refrigerado.setFecha(tecl.next());
                    System.out.println("pais de origen");
                    refrigerado.setPais(tecl.next());
                    System.out.println(refrigerado);

                    break;
                case 3:
                    System.out.println("congelados");
                    do {
                        System.out.println("por que metodo esta congelado?");
                        System.out.println("1)Agua\n 2)Nitrogeno \n 3)Aire\n 0)salir");
                        
                        opc2 = tecl.nextInt();
                        switch (opcion_uno) {
                            case 1:
                                System.out.println("Agua");
                                System.out.println("cual es el lote?");
                                agua.setLote(tecl.nextInt());
                                System.out.println("Fecha de caducidad?");
                                agua.setCad(tecl.next());
                                System.out.println("fecha de envasado");
                                agua.setFecha(tecl.next());
                                System.out.println("pais de origen");
                                agua.setPais(tecl.next());
                                System.out.println("temperatura de mantenimiento");
                                agua.setTemp(tecl.next());
                                System.out.println("dame los kilos de sal por litro de agua");
                                agua.setSal(tecl.nextInt());
                                break;
                            case 2:
                                System.out.println("Nitrogeno");
                                System.out.println("cual es el lote?");
                                nitro.setLote(tecl.nextInt());
                                System.out.println("Fecha de caducidad?");
                                nitro.setCad(tecl.next());
                                System.out.println("fecha de envasado");
                                nitro.setFecha(tecl.next());
                                System.out.println("pais de origen");
                                nitro.setPais(tecl.next());
                                System.out.println("temperatura de mantenimiento");
                                nitro.setTemp(tecl.next());
                                
                                
                                break;
                            case 3:
                                System.out.println("Aire");
                                 System.out.println("Nitrogeno");
                                System.out.println("cual es el lote?");
                                aire.setLote(tecl.nextInt());
                                System.out.println("Fecha de caducidad?");
                                aire.setCad(tecl.next());
                                System.out.println("fecha de envasado");
                                aire.setFecha(tecl.next());
                                System.out.println("pais de origen");
                                aire.setPais(tecl.next());
                                System.out.println("temperatura de mantenimiento");
                                aire.setTemp(tecl.next());
                                 System.out.println("% de nitrogeno");
                                aire.setNitrogeno(tecl.nextDouble());
                                 System.out.println("% de oxigeno");
                                aire.setOxigeno(tecl.nextDouble());
                                 System.out.println("% de dioxido de carbono");
                                aire.setDioCar(tecl.nextDouble());
                                 System.out.println("% de vapor de agua");
                                aire.setVapAgua(tecl.nextDouble());
                                System.out.println(aire);
                                
                                break;
                            default:
                          System.out.println("GOOD BYE");
                        }
                    } while (opc2 != 0);
                    break;
                     default:
                          System.out.println("GOOD BYE");
            }
        } while (opcion_uno != 0);
    }
}
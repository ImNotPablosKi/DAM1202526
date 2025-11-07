package TEMA3.Proyectos.PPTLs;
import  java.util.*;

public class pptls {

    public static void esperar(double seg) { // Funcion para esperar

        int mili = (int) (seg * 1000);

        try {

            Thread.sleep(mili);

        } catch (InterruptedException e) {

            System.out.println("Error de espera");

        }

    }

    public static void verReglas() {
        System.out.println("""
====================== // Reglas del juego PPTLS // =======================
                • Tijera corta Papel y decapita Lagarto.
                • Papel cubre Piedra y refuta Spock.
                • Piedra aplasta Tijera y aplasta Lagarto.
                • Lagarto envenena Spock y devora Papel.
                • Spock rompe Tijera y vaporiza Piedra.
                \n
===========================================================================
                \n
                """);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            int eleccion;

            System.out.println("//////////////// -  BIENVENID☺ AL CLÁSICO PPTLS - ////////////////");
            System.out.println("()()()()()()()() PAPEL / TIJERAS / LAGARTO / SPOCK ()()()()()()()()");
            System.out.println("=========================== 1. JUGAR ==============================");
            System.out.println("====================== 2. CONSULTAR REGLAS ========================");
            System.out.println("=========================== 3. TORNEO ==============================");
            System.out.println("============================ 0. SALIR ==============================");
            System.out.print("Escoja una Opción: ");

           while (!sc.hasNextInt()) {
               System.out.println(" FATAL: Valor no numérico...");
               esperar(0.7);
               System.out.println("Escoja una Opción: ");
               sc.nextLine();
           }

           eleccion = sc.nextInt();

           switch (eleccion) {
               case 1:
                   System.out.println("en desarrollo");
                   break;
               case 2:
                   System.out.println("Cargando Reglas v1.2...");
                   esperar(1.5);
                   verReglas();
                   break;
               case 3:
                   System.out.println("en desarrollo");
                   break;
               case 0:
                   System.out.println("Saliendo...");
                   salir = true;
                   break;
               default:
                   System.out.println("Opción no Válida, Inténtelo de nuevo (y aprende a leer)");
                   break;
           }
        } while (!salir);



    }
}
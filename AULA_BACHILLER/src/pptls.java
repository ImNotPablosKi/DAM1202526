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

    public static int comprobarJugadores() {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int jugadores = 0;

        do {
            System.out.println("Cuantos jugadores van a Participar? (Valor mínimo: 2, Máximo: 4)");
            System.out.print("> ");
            if (!sc.hasNextInt()) {
                System.out.println("Se debe introducir un valor numérico: ");
                sc.nextLine();
            } else {
                jugadores = sc.nextInt();
                sc.nextLine();
                if ( jugadores < 2 || jugadores > 4) {
                    System.out.println("Número de Jugadores Inválido, vuelva a introducir un valor: ");
                } else {
                    System.out.println("Jugadores Aceptados");
                    correcto = true;
                }
            }
        } while (!correcto);

        return jugadores;
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
                    comprobarJugadores();
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
package TEMA3.Proyectos.Jack_el_Negro;
import java.util.*;

public class blackjack {

    // Funciones (dopamine)
    // Es básicamente el juego entero en partes (kms xdd)

    public static void reglas() {
        System.out.println("""
                            Reglas básicas:\s
                            1 El objetivo es obtener una puntuación lo más cercana posible a 21 sin pasarse.
                            2 Cada jugador comienza con dos cartas.
                            3 El jugador puede pedir más cartas (‘pedir’) o plantarse (‘plantarse’).
                            4 Las cartas tienen los siguientes valores:
                            5 1 Del 2 al 10: valen su número. J, Q, K: valen 10 puntos. As (A): vale 1 o 11, según convenga sin pasarse.
                            6 Después del turno del jugador, la banca juega automáticamente:
                            7 1 Pide cartas hasta alcanzar al menos 17 puntos, Si se pasa de 21, el jugador PIERDE automáticamente.
                            8 Gana quien tenga la puntuación más alta sin superar 21 o aquel que consiga exactamente 21.
                            """);
    }

    public static double repartirCarta() {
        // Reparte una carta de valor entre 1 y 11 (Las letras en verdad no hacen falta)
        return (int) (Math.random() * (10-1) + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean jugando = true;

        // Main Menu

        do {

            int eleccion;

            System.out.println("--// BLACKJACK (Joaquín el Negro) //--");
            System.out.println("======================================");
            System.out.println("- Bienvenid@, que desea? - ");
            System.out.println("1 - Jugar Partida");
            System.out.println("2 - Ver Reglas del Juego");
            System.out.println("3 - Salir (Bum ass)");

            while (!sc.hasNextInt()) {
                System.out.println("Fatal: Es necesario un valor numérico:");
                sc.nextLine();
            }

            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    repartirCarta();
                    break;
                case 2:
                    reglas();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    jugando = false;
                    break;
                default:
                    System.out.println("Opción Inválida (Reading banned)");
                    break;
            }

        } while (jugando);

    }


}

package TEMA3.Proyectos.Jack_el_Negro;

import java.util.*;

public class blackjack {

    public static void reglas() {
        // Esos 3 """ Inicializan un bloque de texto, mola un rato
        System.out.println("""
                            Reglas básicas:
                            
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

    public static int valorMano(ArrayList<Integer> mano) {
        int total = 0;
        int ases = 0;
        for (double carta : mano) {
            if (carta == 1) {
                ases++;
            } else if (carta >= 10) {
                total += 10;
            } else {
                total += (int) carta;
            }
        }
        while (ases > 0 && total + 11 <= 21) {
            total += 11;
            ases--;
        }
        while (ases > 0) {
            total += 1;
            ases--;
        }
        return total;
    }

    public static void mostrarMano(ArrayList<Integer> mano) {
        System.out.println("Cartas: " + mano);
        System.out.println("Total: " + valorMano(mano));
    }

    public static void turnoJugador(ArrayList<Integer> mano) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Qué vas a hacer ahora eh? (P para pedir, S para plantarse (pussy) ): ");
            opcion = sc.next().toUpperCase().charAt(0);
            if (opcion == 'P') {
                mano.add((int) repartirCarta());
                mostrarMano(mano);
                if (valorMano(mano) > 21) {
                    System.out.println("Te has pasado de 21, Perdedor... (jijijija.mp3)");
                    return;
                } else if (valorMano(mano) == 21) {
                    System.out.println("BLACKJACK, Enhorabuena!");
                    break;
                }
            } else if (opcion != 'S') {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 'S');
    }

    public static void turnoBanca(ArrayList<Integer> manoBanca) {
        while (valorMano(manoBanca) < 17) {
            manoBanca.add((int) repartirCarta());
        }
        mostrarMano(manoBanca);
    }

    public static void compararManos(ArrayList<Integer> manoJugador, ArrayList<Integer> manoBanca) {
        int puntuacionJugador = valorMano(manoJugador);
        int puntuacionBanca = valorMano(manoBanca);
        if (puntuacionJugador > 21) {
            System.out.println("Gana la banca (psoe)");
        } else if (puntuacionBanca > 21) {
            System.out.println("La banca (psoe) se ha pasado. Enhorabuena bro.");
        } else if (puntuacionJugador > puntuacionBanca) {
            System.out.println("Ganas sobre la banca con: " + puntuacionJugador + " puntos.");
        } else if (puntuacionBanca > puntuacionJugador) {
            System.out.println("Pierdes, Gana la banca con: " + puntuacionBanca + " puntos.");
        } else {
            System.out.println("Empate a un total de " + puntuacionJugador + " puntos.");
        }
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

                case 1: {
                    ArrayList<Integer> manoJugador = new ArrayList<>();
                    ArrayList<Integer> manoBanca = new ArrayList<>();

                    // Repartir las cartitas
                    for (int i = 0; i < 2; i++) {
                        manoJugador.add((int) repartirCarta());
                        manoBanca.add((int) repartirCarta());
                    }

                    // Mostrar manitas
                    mostrarMano(manoJugador);
                    System.out.println("La Banca tiene: " + manoBanca.getFirst());

                    // Tu Turno
                    turnoJugador(manoJugador);

                    // Si no se te ha ido a pernambuco, juega la banca
                    if (valorMano(manoJugador) < 21) {
                        System.out.print("Banca, ");
                        turnoBanca(manoBanca);
                    }

                    // Comparar manos
                    compararManos(manoJugador, manoBanca);

                    // Preguntarle si quiere ser ludópata (OBVIAMENTE)
                    System.out.println("¿Desea jugar otra partida? (El 99% de jugadores para JUSTO antes de su GRAN momento...) (S/N)");
                    if (sc.hasNextDouble()) {
                        System.out.println("Claramente, No sabes leer. Fuera de mi puto casino.");
                        jugando = false;
                    } else {
                        char jugarOtra = sc.next().toUpperCase().charAt(0);
                        sc.nextLine();
                        if (jugarOtra != 'S') {
                            System.out.println("Later nigga");
                            jugando = false;
                        }
                    }
                        break;
                }
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
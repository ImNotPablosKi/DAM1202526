package PPTLs;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        boolean correcto = false;

        do {
            int eleccion;

            System.out.println("//////////////// -  BIENVENID☺ AL CLÁSICO PPTLS - ////////////////");
            System.out.println("()()()()()()()() PAPEL / TIJERAS / LAGARTO / SPOCK ()()()()()()()()");
            System.out.println("=========================== 1. JUGAR ==============================");
            System.out.println("====================== 2. CONSULTAR REGLAS ========================");
            System.out.println("=========================== 3. TORNEO ==============================");
            System.out.println("============================ 0. SALIR ==============================");
            System.out.print("Escoja una Opción: ");

            do {
                if (!sc.hasNextInt()) {
                    System.out.println(" * Valor Inválido * ");
                    esperar(1);
                    System.out.print("Escoja una Opción: ");
                } else {
                    eleccion = sc.nextInt();
                    do {
                        if (eleccion < 0 || eleccion > 3) {
                            System.out.println(" * Valor Inválido * ");
                            esperar(1);
                            System.out.print("Escoja una Opción: ");

                        } else {
                            correcto = true;
                        }
                    } while (!correcto);
                }
                sc.nextLine();
            } while (!correcto);

        } while (!salir);



    }
}

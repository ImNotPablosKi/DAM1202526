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
               System.out.println(" * Valor Incorrecto! * ");
               esperar(0.7);
               System.out.println("Escoja una Opción: ");
               sc.nextLine();
           }

           eleccion = sc.nextInt();


        } while (!salir);



    }
}
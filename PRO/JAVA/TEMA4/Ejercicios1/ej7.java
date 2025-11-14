package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej7 {

    public static void filtroNota(double nota) {

        if (nota < 5 ) {

            System.out.println("Suspenso...");

        } else if (nota >= 5 && nota < 7) {

            System.out.println("Aprobado");

        } else if (nota >= 7 && nota < 9) {

            System.out.println("Notable!");

        } else if (nota >= 9 && nota < 10) {

            System.out.println("Sobresaliente!!! ☺ ");

        } else {

            System.out.println(" ☺☺☺☺ UN PUTO 10 JODER :STEAMHAPPY: ☺☺☺☺");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        double nota = 0;

        do {

            System.out.println("Dame una notilla bro");
            System.out.print("> ");

            try {

                nota = Double.parseDouble(sc.nextLine());
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("Eso NO es una notilla válida lilvro...");

            }

            if (nota > 10 || nota < 0) {

                System.out.println("Eso NO es una notilla válida lilvro...");
                correcto = false;

            }

        } while (!correcto);

        filtroNota(nota);

    }
}

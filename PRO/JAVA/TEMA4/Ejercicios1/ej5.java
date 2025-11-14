package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej5 {

    public static void dibujarTriangulo(String cosa, int ancho) {

        int alto = ancho;

        for (int i = 0; i < alto; i++) {

            for (int j = 0; j < ancho; j++) {

                System.out.print(cosa);

            }

            ancho -= 1;

            System.out.println(" ");

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        String letra;
        int ancho = 0;

        System.out.println("Dime un carácter para el triángulo (loquesea)");
        System.out.print("> ");

        letra = sc.next();
        sc.nextLine();

        do {

            System.out.println("Ahora dime como de ancho quieres el triángulo.");
            System.out.print("> ");

            try {

                ancho = Integer.parseInt(sc.nextLine());
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("Valor Inválido");

            }

        } while (!correcto);

        dibujarTriangulo(letra, ancho);

    }
}

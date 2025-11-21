package pruebas;

import java.util.Scanner;

public class tablitaPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do {

            System.out.print("Dame la altura que le vas a meter al triangulillo vro\n> ");

            try {

                int altura = Integer.parseInt(sc.nextLine());
                int anchura = altura;
                hacerTriangulo(altura, anchura);
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("Sabes leer?");

            }

        } while (!correcto);
    }

    public static void hacerTriangulo(int alto, int ancho) {

        for (int i = 0; i < alto ; i++) {

            for (int j = 0; j < ancho ; j++) {

                System.out.print("*");

            }
            ancho -= 1;
            System.out.println(" ");
        }

    }

}

package pruebas;

import java.util.Scanner;

public class rectangulillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do {

            System.out.print("Pasa el alto del rectángulo porfa :3 (>>>>>NUMEROS ENTEROS<<<<<)\n> ");

            try {

             int alto = Integer.parseInt(sc.nextLine());

             do {

                 System.out.println("Ahora pasa el ancho venga :D\n> ");

                 try {

                     int ancho = Integer.parseInt(sc.nextLine());
                     hacerRectangulo(alto, ancho);
                     correcto = true;

                 } catch (NumberFormatException e) {

                     System.out.println("no");

                 }

             } while (!correcto);

            } catch (NumberFormatException e) {

                System.out.println("no");

            }

        } while (!correcto);
    }

    public static void hacerRectangulo(int alto, int ancho) {

        for (int i = 0; i < alto ; i++) {

            for (int j = 0; j < ancho ; j++) {

                if (i == 0 || i == alto-1 || j == 0 || j == ancho-1) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");

                }

            }

            System.out.println(" ");

        }

    }

}

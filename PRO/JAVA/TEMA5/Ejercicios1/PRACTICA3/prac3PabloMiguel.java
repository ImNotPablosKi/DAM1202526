package TEMA5.Ejercicios1.PRACTICA3;

import java.util.Scanner;

public class prac3PabloMiguel {

    public static int cosa(int numero) {

        if (numero == 0) {

            return 0;

        } else {

            return numero % 10 + cosa(numero/ 10);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int num = 0;

        do {

            // Pido números, el salto de línea es pura estética
            System.out.print("Dame numerines\n> ");

            try {

                // Acumular numero
                num = Integer.parseInt(sc.nextLine());

                // Parar programa si mete negativo
                if (num < 0) {

                    correcto = true;

                }


                // Parar al usuario tonto
            } catch (NumberFormatException e) {

                System.out.println("no");

            }

            if (num < 0) {

                System.out.println("Saliendo...");

            } else {

                System.out.println(cosa(num));

            }


        } while (!correcto);

        // Cerrar
        sc.close();
    }

}

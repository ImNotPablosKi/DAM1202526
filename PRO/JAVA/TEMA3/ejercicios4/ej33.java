package TEMA3.ejercicios4;
import java.util.*;

public class ej33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        boolean salir = false;
        int numero = 0;

        do {
            System.out.print("Introduce un numerin: ");
            if (sc.hasNextInt()) {

                numero = sc.nextInt();
                sc.nextLine();
                if (numero <= 0) {

                    System.out.println("Que sea positivo anda: ");

                } else {

                    correcto = true;

                }

            } else {

                System.out.println("Creo que eso NO es válido, repite");
                sc.nextLine();

            }

        } while (!correcto);

        do {

            if (numero % 2 == 0) {

                System.out.print(numero + " | " + 2);
                System.out.println(" ");
                numero = numero / 2;

            } else if (numero % 3 == 0) {

                System.out.print(numero + " | " + 3);
                System.out.println(" ");
                numero = numero / 3;

            } else {

                System.out.print(numero + " | " + 1);
                System.out.println(" ");
                salir = true;

            }

        } while (!salir);
    }
}

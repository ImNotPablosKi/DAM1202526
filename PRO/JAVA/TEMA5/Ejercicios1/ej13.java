package TEMA5.Ejercicios1;

import java.util.Arrays;
import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bien = false;

        do {

            System.out.print("Dime cuantos carácteres vas a introducir...\n> ");

            try {

                int cant = Integer.parseInt(sc.nextLine());
                String[] nombres = new String[cant];

                for (int i = 0; i < nombres.length ; i++) {

                    System.out.print("Vé dándome nombres va\n> ");

                    nombres[i] = sc.next();

                }

                System.out.println("Original: ");

                for (String nombre : nombres) {

                    System.out.print(nombre + ", ");

                }

                System.out.println();

                Arrays.sort(nombres);

                System.out.println("En Orden Alfabético: ");

                for (String nombre : nombres) {

                    System.out.print(nombre + ", ");

                }

                bien = true;

            } catch (NumberFormatException e) {

                System.out.println("no.");

            }

        } while (!bien);


    }
}

package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej14 {

    public static int sumaCifras(int num) {

        if (num == 0) {

            return 0;

        } else if (num == 1) {

            return 1;

        } else {

            return num + sumaCifras(num-1);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do {

            System.out.println("Dame un numerín (entero anda)");
            System.out.print("> ");

            try {

                int num = Integer.parseInt(sc.nextLine());
                System.out.println("La suma de las cifras de " + num + " es: " + sumaCifras(num));
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("uh");

            }

        } while (!correcto);

    }
}

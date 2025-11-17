package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej11 {

    public static int factorial(int num) {

        if (num == 0) {

            return 0;

        } else if (num == 1) {

            return num;

        } else {

            return num * factorial(num-1);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean correcto = false;

        do {

            System.out.println("Dime un numerín pal factorial");
            System.out.print("> ");

            try {

                int num = Integer.parseInt(sc.nextLine());
                System.out.println("El factorial de " + num + " es: " + factorial(num));
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("nuh uh");

            }

        } while (!correcto);
    }
}

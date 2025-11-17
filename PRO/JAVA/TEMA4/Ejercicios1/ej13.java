package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej13 {

    public static int fibonacci(int num) {

        if (num == 0) {

            return 0;

        } else if (num == 1) {

            return 1;

        } else {

            return fibonacci(num-1) + fibonacci(num-2);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do {

            System.out.println("Dame el límite que le vas a poner a fibonacci: ");
            System.out.print("> ");

            try  {

                int num = Integer.parseInt(sc.nextLine());
                System.out.println("Tu sucesión de Fibonacci es: " + fibonacci(num));
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("uh");

            }

        } while (!correcto);

    }
}

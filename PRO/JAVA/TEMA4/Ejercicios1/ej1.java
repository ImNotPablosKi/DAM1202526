package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej1 {

    public static int signo(double numero) {
        if (numero > 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bien = false;
        double num = 0;

        do {

            System.out.println("Introduce un número REAL bro");
            System.out.print("> ");

            try {

                num = Double.parseDouble(sc.nextLine());
                bien = true;

            } catch (NumberFormatException e) {

                System.out.println("Valor Inválido!");

            }
        } while (!bien);

        System.out.println(signo(num));

        sc.close();

    }
}

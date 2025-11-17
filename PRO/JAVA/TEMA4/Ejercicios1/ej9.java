package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej9 {

    public static void esperar(double seg) { // Funcion para esperar

        int mili = (int) (seg * 1000);

        try {

            Thread.sleep(mili);

        } catch (InterruptedException e) {

            System.out.println("Error de espera");

        }

    }

    public static int cuentaAtras(int numero) {

        System.out.println(numero);

        if (numero == 0) {

            return 0;

        } else {

            esperar(0.5);
            return cuentaAtras(numero-1);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do {

            System.out.println("Dime un numerín para contar...");
            System.out.print("> ");

            try {

                int num = Integer.parseInt(sc.nextLine());
                cuentaAtras(num);
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("Valor Inválido!");

            }

        } while (!correcto);

    }
}

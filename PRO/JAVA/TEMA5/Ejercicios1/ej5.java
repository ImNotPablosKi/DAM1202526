package TEMA5.Ejercicios1;
import java.util.Arrays;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        int[] rando = new int[10];

        for (int i = 0; i < rando.length; i++) {

            rando[i] = (int) (Math.random() * 100);

            System.out.print(rando[i] + " ");

        }


        do {

            System.out.println();
            System.out.println("Dime un numerín a ver si está en el array (ignora el hecho de que los tienes arriba anda)");
            System.out.print("> ");

            try {

                int num = Integer.parseInt(sc.nextLine());

                for (int cosa : rando) {

                    if (cosa == num) {

                        System.out.println("Encontrado!");
                        correcto = true;

                    }

                }

            } catch (NumberFormatException e) {

                System.out.println("uhh");

            }

        } while (!correcto);

    }
}

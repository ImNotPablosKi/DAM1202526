package TEMA5.Ejercicios1;

import java.util.ArrayList;

public class ej9 {
    public static void main(String[] args) {
        int[] randoms = new int[10];
        int contador = 0;

        System.out.print("Array: ");

        for (int i = 0; i < randoms.length; i++) {

            randoms[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11));
            System.out.print(randoms[i] + " ");

        }

        System.out.println(" ");

        for (int i = -10; i <= 10; i++) {

            contador = 0;
            for (int j = 0; j < randoms.length-1; j++) {

                if (i == randoms[j]) {

                    contador++;

                }

            }

            if (contador > 1) {

                System.out.println("El número " + i + " se repite " + contador + " veces.");

            }

        }
    }
}

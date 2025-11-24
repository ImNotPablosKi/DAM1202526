package TEMA5.Ejercicios1;

public class ej10 {
    public static void main(String[] args) {
        int[] rando = new int[10];
        int contador;

        for (int i = 0; i < rando.length ; i++) {

            rando[i] = (int) (Math.random() * (10 - (-11) + 1 + (-11) ));
            System.out.print(rando[i] + " ");

        }

        System.out.println(" ");

        for (int i = -10; i <= 10; i++) {

            contador = 0;
            for (int j = 0; j < rando.length-1; j++) {

                if (i == rando[j]) {

                    contador++;

                }

            }

            if (contador == 1) {

                System.out.println("El número " + i + "NO SE REPITE");

            }

        }


    }
}

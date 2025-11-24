package TEMA5.Ejercicios1;

public class ej11 {
    public static void main(String[] args) {

        // Aviso de Sufrida, gorda, gigante, masiva incluso.

        int[] rando = new int[10];
        boolean repetido = true;

        for (int i = 0; i < rando.length ; i++) {

            rando[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11));

        }

        for (int i = -10 ; i < 10 ; i++) {

            for (int j = 0; j < rando.length-1 ; j++) {

                do {

                    if (i == rando[j]) {

                        rando[j] = (int) (Math.random() * (10 - (-11) + 1) + (-11));

                        if (i != rando[j]) {

                            repetido = false;

                        }

                    }

                } while (repetido);

            }

        }

        for (int num : rando) {

            System.out.print(num + " ");

        }

    }
}

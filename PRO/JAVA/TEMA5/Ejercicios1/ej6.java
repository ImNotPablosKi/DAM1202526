package TEMA5.Ejercicios1;

public class ej6 {
    public static void main(String[] args) {

        int neg = 0;
        int pos = 0;

        int[] rando = new int[10];

        for (int i = 0; i < rando.length ; i++) {

            // ft. @hecprooll (https://github.com/hector6933)
            // (Max - (-min + 1) + 1) + (-min + 1) el mas uno de los min es que le sumas uno al valor negativo uh
            rando[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11) );
            System.out.print(rando[i] + " ");

            if (rando[i] >= 0) {

                pos += 1;

            } else {

                neg += 1;

            }

        }

        System.out.println();
        System.out.println("Has sacado " + pos + " positivos y " + neg + " negativos");

    }
}

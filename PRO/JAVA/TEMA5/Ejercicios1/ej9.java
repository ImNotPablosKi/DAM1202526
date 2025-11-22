package TEMA5.Ejercicios1;

import java.util.ArrayList;

public class ej9 {
    public static void main(String[] args) {
        int[] rando = new int[10];
        int contador = 0;
        ArrayList<Integer> aux = new ArrayList<>();

        for (int i = 0; i < rando.length ; i++) {

            rando[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11));
            System.out.print(rando[i] + " ");


        }

        for (int i = 0; i < rando.length - 1; i++) { // Repetir hasta uno menos (penúltimo)

            if (rando[i] == rando[i+1]) {

                if (!aux.contains(rando[i])) { // Añadir SOLO si NO ESTÁ en la lista ya

                    aux.add(rando[i]);
                    contador++;

                }

            }

        }

        System.out.println();
        System.out.println("Se repiten los siguientes numeros " + contador + " veces:");

        for (int j : aux) {

            System.out.print(j);

        }

    }
}

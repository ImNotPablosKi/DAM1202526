package TEMA5.Ejercicios1;

import java.util.ArrayList;

public class ej10 {
    public static void main(String[] args) {
        int[] rando = new int[10];
        ArrayList<Integer> aux = new ArrayList<>();

        for (int i = 0; i < rando.length ; i++) {

            rando[i] = (int) (Math.random() * (10 - (-11) + 1 + (-11) ));
            System.out.print(rando[i] + " ");

        }

        for (int i = 0; i < rando.length - 1; i++) {

            if (rando[i] != rando[i+1]) {

                if (!aux.contains(rando[i])) {

                    aux.add(rando[i]);

                }

            }

        }

        System.out.println();
        System.out.println("NO se repiten los siguientes numeros:");

        for (int j : aux) {

            System.out.print(j + " ");

        }


    }
}

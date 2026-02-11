package Ejercicios1.EJ2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Integer> randos = new ArrayList<>();

        Random rando = new Random();

        do {

            int aux = rando.nextInt(0,10);

            if (!randos.contains(aux)) {

                randos.add(rando.nextInt(0,10));

            }

        } while (randos.size() != 3);

        System.out.println(randos);

    }
}

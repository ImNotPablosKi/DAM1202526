package Ejercicios1.EJ2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < 3) {

            numeros.add(random.nextInt(10)); // genera números entre 0 y 9

        }

        System.out.println("Números aleatorios: " + numeros);

    }
}

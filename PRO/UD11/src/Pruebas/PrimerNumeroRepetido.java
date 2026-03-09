package Pruebas;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;

public class PrimerNumeroRepetido {
    public static void main(String[] args) {

        Random rando = new Random();

        // Mapa Linked, los mapas linked mantienen el orden de inserción.
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 1; i < 20; i++) {

            int n = rando.nextInt(0, 50);
            System.out.println(n);

            // Comprobar antes de que lo añada (esto obviamente exceptúa la primera iteración)
            // Si existe, romper y salir
            if (map.containsKey(n)) {

                System.out.println(n);
                return;

            }

            // Añadir en caso de que no se repita
            map.put(n, i);

        }

    }
}

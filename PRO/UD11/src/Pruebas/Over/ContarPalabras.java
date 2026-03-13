package Pruebas.Over;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class ContarPalabras {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                for (String s: line.toLowerCase().split("\\s")) {

                    mapa.put(s, mapa.containsKey(s) ? mapa.get(s) + 1 : 1);

                }

            }

        } catch (IOException e) {

            System.out.println("Error de E/S");

        }

        System.out.println("{PALABRA = VECES}");
        System.out.println("- - - - - - - - - -");
        System.out.println(mapa);

    }
}

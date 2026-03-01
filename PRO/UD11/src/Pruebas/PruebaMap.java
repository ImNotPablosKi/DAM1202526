package Pruebas;

import java.util.Scanner;
import java.util.TreeMap;

public class PruebaMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime algo así guapo anda: ");
        String frase = sc.nextLine();

        frase = frase.replaceAll(" ", "");

        TreeMap<Character, Integer> letras = new TreeMap<>();

        for (int i = 0; i < frase.length(); i++) {

            letras.put(frase.charAt(i), letras.containsKey(frase.charAt(i)) ? letras.get(frase.charAt(i)) + 1 : 1);

        }

    }
}

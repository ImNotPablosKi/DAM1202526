package Pruebas;

import java.util.HashMap;
import java.util.Scanner;

public class MapOtraVez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime algo: ");
        String frase = sc.nextLine();

        frase = frase.replaceAll(" ", "");

        // El HashMap no lo ordena alfabéticamente :C
        HashMap<Character, Integer> letras = new HashMap<>();

        for (int i = 0; i < frase.length() ; i++) {

            letras.put(frase.charAt(i), letras.containsKey(frase.charAt(i)) ? letras.get(frase.charAt(i)) + 1 : 1);

        }

        System.out.println(letras);

        sc.close();

    }
}

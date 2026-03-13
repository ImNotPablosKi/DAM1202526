package Pruebas.Over;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ContarCaracteres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime algo");
        System.out.print("> ");

        String frase = sc.nextLine().toLowerCase();

        frase = frase.trim();

        frase = frase.replaceAll("\\s", "");

        LinkedHashMap<Character, Integer> mapa = new LinkedHashMap<>();

        for (Character c: frase.toCharArray()) {

            mapa.put(c, mapa.containsKey(c) ? mapa.get(c) + 1: 1);

        }

//        for (int i = 0; i < frase.length(); i++) {
//
//            mapa.put(frase.charAt(i), mapa.containsKey(frase.charAt(i)) ? mapa.get(frase.charAt(i)) +1 : 1);
//
//        }

        System.out.println("{Letra=Posicion}");
        System.out.println("-----------------");
        System.out.println(mapa);

    }

}

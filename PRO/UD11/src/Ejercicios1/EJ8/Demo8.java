package Ejercicios1.EJ8;

import java.util.Scanner;
import java.util.TreeMap;

public class Demo8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime algo BROVR");
        System.out.print("> ");

        String frase = sc.nextLine();

        frase = frase.replaceAll(" ", "");

        TreeMap<Character, Integer> letras = new TreeMap<>();

        for (int i = 0; i < frase.length() ; i++) {

            letras.put(frase.charAt(i), letras.containsKey(frase.charAt(i)) ? letras.get(frase.charAt(i)) + 1 : 1);

        }

        System.out.println(letras);

        sc.close();

    }
}

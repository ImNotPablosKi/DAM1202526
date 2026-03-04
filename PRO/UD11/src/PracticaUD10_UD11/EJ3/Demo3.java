package PracticaUD10_UD11.EJ3;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Pedir y almacenar la frase
        System.out.println("Dime algo: ");
        String frase = sc.nextLine();

        // Quitar espacios sobrantes
        frase = frase.trim();

        // Quitar espacios en medio
        frase = frase.replaceAll(" ", "");

        // LowerCase para evitar problemas o errores al contar
        frase = frase.toLowerCase();

        // Map necesario
        LinkedHashMap<Character, Integer> letras = new LinkedHashMap<>();

        // Añadir Clave y valor a cada carácter, si ya lo ha almacenado le sumo 1
        for (int i = 1; i < frase.length(); i++) {

            char c = frase.charAt(i);

            if (letras.containsKey(c)) {

                System.out.println("Se repite el caracter " +  c + " en posición: " + i);
                break;

            }

            letras.put(c, i);

//            letras.put(frase.charAt(i), letras.containsKey(frase.charAt(i)) ? letras.get(frase.charAt(i)) + 1 : 1);

        }

        // Cierre del scanner
        sc.close();

    }
}

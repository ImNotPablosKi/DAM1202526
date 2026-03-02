package EJ3;

import java.util.LinkedHashMap;
import java.util.Map;
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
        for (int i = 0; i < frase.length(); i++) {

            letras.put(frase.charAt(i), letras.containsKey(frase.charAt(i)) ? letras.get(frase.charAt(i)) + 1 : 1);

        }

        for (Map.Entry<Character, Integer> entry : letras.entrySet()) {

            // Solo mostrar los que se repiten (o sea, cuyo valor es mayor a 1)
            if (entry.getValue() > 1) {

                System.out.println("Letra: " + entry.getKey().toString() + ", veces: " + entry.getValue());
                break;

            } else {

                // Si no hay repeticiones, imprimir info
                System.out.println("No hay repeticiones");
                break;

            }

        }

        // Cierre del scanner
        sc.close();

    }
}

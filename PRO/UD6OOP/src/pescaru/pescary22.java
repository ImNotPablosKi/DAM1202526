package pescaru;

import java.util.Scanner;

public class pescary22 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /* Crea un programa que pida al usuario introducir una frase y después,,
independientemente de cómo la haya escrito, elimine espacios sobrantes al
principio y al final y:
a. La muestre en mayúsculas. Ej. HOLA MUNDO
b. La muestre en minúsculas. Ej. hola mundo
c. La muestre con la primera letra de cada palabra en mayúsculas y el resto
en minúsculas. Ej. Hola Mundo */

        System.out.println("dime algo y que sobre espacios");

        String frase = sc.next().trim();

        StringBuilder frase2 = new StringBuilder(frase);

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());



        for (int i = 0; i < frase2.length() ; i++) {

            if (frase2.charAt(i) == ' ') {

                frase2.setCharAt(i+1, frase2.charAt(i+1));

            }

        }

    }
}

package ejerciciosDuros;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creamos el escáner...

        System.out.println("Mi bro, que numerín desea usted en el día de, uh, hoy?: (Del 65 al 122 porfi :D)");
        int letra = sc.nextInt();

        char cosaAscii = (char) letra; // Para pasar a ascii

        System.out.println("Ese numerín es el equivalente ascii de... " + cosaAscii);

        if (letra >= 65 && letra <= 90 ) {
            System.out.println("El carácter es una Mayúscula :D");
        } else if (letra >= 97 && letra <= 122) {
            System.out.println("El carácter es una minúscula D:");
        } else if (letra == 65 || letra == 69 || letra == 73 || letra == 79 || letra == 85) {
            System.out.println("Además, es una VOCAL");
        } else if (letra == 97 || letra == 101 || letra == 105 || letra == 111 || letra == 117) {
            System.out.println("Aunque por lo menos es vocal :')");
        } else {
            System.out.println("Eyyy, que tal está usted Usuario tonto? O quizás profesor cabrón?");
        }
    }
}
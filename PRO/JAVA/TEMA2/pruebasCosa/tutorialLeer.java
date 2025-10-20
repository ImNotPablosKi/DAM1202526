package TEMA2.pruebasCosa;

import java.util.Scanner;

public class tutorialLeer {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in); // Creo el Lector

        System.out.print("Introduce un numerin entero porfa: ");
        int numEntero = lector.nextInt(); // Leo el entero

        double numDoble = numEntero; // Convertir a double

        System.out.println("El número como 'double' es: " + numDoble);

        lector.close(); // Cerrar Scanner (Buena Práctica)
    }
}

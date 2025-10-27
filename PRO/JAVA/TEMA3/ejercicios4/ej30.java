package TEMA3.ejercicios4;
import java.util.*;

public class ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alto;
        int ancho;
        System.out.println("Cuantos caracteres de alto quieres el triángulo?: ");
        while (!sc.hasNextInt()) {
            System.out.println("Valor inválido. Introduce un número positivo: ");
            sc.nextLine();
        }

        alto = sc.nextInt();

        ancho = 1;

        for (int i = 0; i < alto ; i++) {
            for (int j = 0; j < ancho ; j++) {
                System.out.print("*");
            }
            ancho += 1;
            System.out.println(" ");
        }
    }
}

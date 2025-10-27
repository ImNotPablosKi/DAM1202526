package TEMA3.ejercicios4;
import java.util.*;

public class ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alto = 0;
        int ancho = 0;
        boolean cosa = false;

        do {
            System.out.println("Altura deseada: ");
            if (sc.hasNextInt()) {
                alto = sc.nextInt();
                sc.nextLine();
                do {
                    System.out.println("Anchura deseada: ");
                    if (sc.hasNextInt()) {
                        ancho = sc.nextInt();
                        cosa = true;
                    } else {
                        System.out.println("Valor Inválido, introduce un número positivo");
                        sc.nextLine();
                    }
                } while (!cosa);
            } else {
                System.out.println("Valor Inválido, introduce un número positivo");
                sc.nextLine();
            }
        } while (!cosa);

        System.out.println("Altura: " + alto + ", Anchura: " + ancho);

        for (int i = 0; i <= alto ; i++) {
            for (int j = 0; j <= ancho; j++) {
                if (i == 0 || i == alto || j == 0 || j == ancho ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

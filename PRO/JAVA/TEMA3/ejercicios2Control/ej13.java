package TEMA3.ejercicios2Control;
import java.util.*;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cosa = false;

        do {
            String cifras;
            int num = 0;
            System.out.println("Introduce un número entero: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sc.nextLine();
                if (num < 0) {
                    System.out.println("DEBE ser positivo...");
                    cosa = false;
                } else {
                    cifras = Integer.toString(num);
                    System.out.println("Dicho número tiene: " + cifras.length() + " cifras :3");
                    cosa = true;
                }
            } else {
                System.out.println("Reading banned ig :wilted_rose:");
                sc.nextLine();
                cosa = false;
            }
        } while (!cosa);

    }
}

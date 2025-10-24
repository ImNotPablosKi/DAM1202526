package TEMA3.ejercicios2Control;
import java.util.*;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cosa = false;

        do {
            int num = 0;
            long resultado = 1;
            System.out.println("Introduce un número entero >3: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sc.nextLine();
                if (num < 0) {
                    System.out.println("Pero vamos a ver, que DEBE ser positivo...");
                    cosa = false;
                } else {
                    for (int i = num; i > 1 ; i--) {
                        resultado = resultado * i;
                    }
                    System.out.println("Resultado: " + resultado);
                    cosa = true;
                }
            } else {
                System.out.println("Eh, de las mejores, imbécil");
                sc.nextLine();
                cosa = false;
            }
        } while (!cosa);
    }
}

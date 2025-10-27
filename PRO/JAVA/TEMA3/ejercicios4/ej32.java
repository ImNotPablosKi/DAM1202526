package TEMA3.ejercicios4;
import java.util.*;

public class ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        boolean correcto = false;

        do {
            System.out.println("Dime un numerín: ");
            if (!sc.hasNextInt()) {
                System.out.println("Valor inválido...");
                sc.nextLine();
            } else {
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("El valor introducido DEBE ser positivo: ");
                    sc.nextLine();
                } else {
                    correcto = true;
                }
            }
        } while (!correcto);

        for (int i = 1; i < num ; i++) {
            if (num % i == 0) {
                System.out.print(i + ".");
            }
        }
    }
}

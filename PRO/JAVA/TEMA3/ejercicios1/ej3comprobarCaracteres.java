package TEMA3.ejercicios1;
import java.util.*;

public class ej3comprobarCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean lmao = false;

        do {

            String opc;
            System.out.println("Escribe una cosa quiquiricosa: ");
            if (sc.hasNextDouble() && !sc.hasNextInt()) {
                System.out.println("Has introducido un número real de cojones fr.");
                sc.nextLine();
            } else if (sc.hasNextInt()) {
                System.out.println("Has introducido un número entero.");
                sc.nextLine();
            } else if (sc.hasNext()) {
                System.out.println("Has introducido un carácter");
                sc.nextLine();
            } else {
                System.out.println("FFFJSSKJLBHUIOHUJJ pero que cojones");
                sc.nextLine();
            }

            System.out.println("Desea volver a empezar?: (S/N)");
            opc = sc.next();
            sc.nextLine();
            if (opc.equalsIgnoreCase("S")) {
                lmao = false;
            } else if (opc.equalsIgnoreCase("N")) {
                System.out.println("Saliendo...");
                lmao = true;
            } else {
                System.out.println("Reading banned? Indeed");
                lmao = false;
            }
        } while (!lmao);
    }
}

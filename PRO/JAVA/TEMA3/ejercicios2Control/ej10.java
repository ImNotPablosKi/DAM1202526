package TEMA3.ejercicios2Control;
import java.util.*;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean tetica = false;

        do {
            boolean comprobar = false;

            int num1 = 0;
            int num2 = 0;
            int resultado = 0;
            String opc;

            do {

                System.out.println("Dime un número: ");
                if (sc.hasNextInt()) {
                    num1 = sc.nextInt();
                    sc.nextLine();
                    do {
                        System.out.println("Dime otro número: ");
                        if (sc.hasNextInt()) {
                            num2 = sc.nextInt();
                            sc.nextLine();
                            comprobar = true;
                        } else {
                            System.out.println("Valor Incorrecto...");
                            sc.nextLine();
                            comprobar = false;
                        }
                    } while (!comprobar);
                } else {
                    System.out.println("Valor Incorrecto...");
                    sc.nextLine();
                    comprobar = false;
                }
            } while (!comprobar);

            for (int i = 1; i < num2+1 ; i++) {
                resultado = resultado + num1;
            }

            System.out.println("Resultado: " + resultado);
            System.out.println("Desea volver a empezar? (S/N)");
            opc = sc.next();
            sc.nextLine();
            if (opc.equalsIgnoreCase("S")) {
                tetica = false;
            } else if (opc.equalsIgnoreCase("N")) {
                System.out.println("Saliendo...");
                tetica = true;
            } else {
                System.out.println("Reading banned");
            }
        } while (!tetica);
    }
}
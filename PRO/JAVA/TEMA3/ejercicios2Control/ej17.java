package TEMA3.ejercicios2Control;
import java.util.*;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cosa = false;


            long recaudo = 0;
            long max = 0;
            long min = 100000000;
            long recaudoTotal = 0;
            int auxMax = 0;
            int auxMin = 0;

             for (int i = 1; i < 13 ; i++) {
                do {
                    System.out.println("Introduce las ganancias del mes nº" + i + ": ");
                    if (sc.hasNextLong()) {
                        recaudo = sc.nextLong();
                        sc.nextLine();
                        recaudoTotal = recaudoTotal + recaudo;
                        if (recaudo > max) {
                            max = recaudo;
                            auxMax = i;
                        }
                        if (recaudo < min) {
                            min = recaudo;
                            auxMin = i;
                        }
                        cosa = true;
                    } else {
                        System.out.println("Valor Inválido :3");
                        sc.nextLine();
                        cosa = false;
                    }
                } while (!cosa);
             }
            System.out.println("El total ganado es de: " + recaudoTotal + "€, con una media de " + (recaudoTotal/12) + "€.");
            System.out.println("El mes con menor recaudación ha sido el mes " + auxMin + ": " + min + "€");
            System.out.println("El mes con mayor recaudación ha sido el mes " + auxMax + ": " + max + "€");



    }
}

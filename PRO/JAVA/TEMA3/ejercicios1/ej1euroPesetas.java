package TEMA3.ejercicios1;
import java.util.*;

public class ej1euroPesetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean mal = false;

        do {

            double eur = 0;
            System.out.println("DAME EL DINERO DEL ALMUERZO! (en peseticas): ");

            if (sc.hasNextDouble()) {

                eur = sc.nextDouble();
                sc.nextLine();

                if (eur > 0) {

                    // Pa que se muestre en formato decimal correcto.
                    System.out.println("Tienes " + String.format("%.2f",(eur/166.386)) + "€ pal almuerzo máquina.");
                    mal = true;

                } else {

                    System.out.println("Eh muy buena, 0 pesetas... imbécil...");
                    mal = false;

                }
            } else {

                System.out.println("QUE ES ESTA MIERDA AAAAARGHFJOHUIVHYUKUKUOOOO");
                sc.nextLine();
                mal = false;

            }
        } while (!mal);

    }
}

package TEMA3.ejercicios2Control;
import java.util.*;

public class ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean massive = false;

        do {
            boolean correcto = false;

            int num1;
            int num2;
            int contador = 0;
            String opc;

            do {

                System.out.print("Dime un número entero: ");

                if (leer.hasNextInt()) {

                    num1 = leer.nextInt();
                    leer.nextLine();
                    do {

                        System.out.print("Dime otro número entero: ");
                        if (leer.hasNextInt()) {

                            num2 = leer.nextInt();
                            leer.nextLine();

                            do {

                                if (num1 > 1) {

                                    num1 = num1 - num2;
                                    contador +=1;

                                } else {

                                    correcto = true;
                                    System.out.println("La división es " + contador);

                                }

                            } while (!correcto);

                        } else {

                            System.out.println("Eso *NO* es un número entero válido");
                            leer.nextLine();

                        }

                    } while (!correcto);

                } else {

                    System.out.println("Eso *NO* es un número entero válido");
                    leer.nextLine();

                }

            } while (!correcto);

            System.out.println("Desea volver a empezar? (S/N)");
            opc = leer.next();
            leer.nextLine();

            if (opc.equalsIgnoreCase("S")) {

                massive = false;

            } else if (opc.equalsIgnoreCase("N")) {

                System.out.println("Saliendo...");
                massive = true;

            } else {

                System.out.println("Reading banned");

            }

        } while (!massive);

        leer.close();
    }

}
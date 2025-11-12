package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej3 {

    public static int potencia(int num1, int num2) {

        int total = 1;

        for (int i = 0; i < num2 ; i++) {

            total = total * num1;

        }

        return total;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int num1 = 0;
        int num2 = 0;

        do {

            System.out.println("Dime un un numerín: ");

            try {

                num1 = Integer.parseInt(sc.nextLine());

                do {

                    System.out.println("Dime EL EXPONENTE bro venga porfa :3 --> ");

                    try {

                        num2 = Integer.parseInt(sc.nextLine());
                        correcto = true;

                    } catch (NumberFormatException e) {

                        System.out.println("Valor Inválido!");
                    }

                } while (!correcto);

            } catch (NumberFormatException e) {

                System.out.println("Valor Inválido!");

            }

        } while (!correcto);

        System.out.println("La potencia es: " + potencia(num1, num2));
    }
}

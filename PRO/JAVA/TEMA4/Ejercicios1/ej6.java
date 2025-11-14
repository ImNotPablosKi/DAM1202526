package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej6 {

    public static double media(int num1, int num2) {

        return (double) (num1 + num2) / 2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int num1 = 0;
        int num2 = 0;

        do {

            System.out.println("Dime un numerín (entero)");
            System.out.print("> ");

            try {

                num1 = Integer.parseInt(sc.nextLine());

                do {

                    System.out.println("Dime OTRO numerín");
                    System.out.print("> ");

                    try {

                        num2 = Integer.parseInt(sc.nextLine());
                        correcto = true;

                    } catch (NumberFormatException e) {

                        System.out.println("veo que sigues sin saber leer...");

                    }

                } while (!correcto);

            } catch (NumberFormatException e) {

                System.out.println("no sabes leer?");

            }

        } while (!correcto);

        System.out.println("La media de esos dos números es: " + media(num1, num2));

    }
}

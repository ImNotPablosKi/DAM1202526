package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej8 {

    public static int esMenor(int numero1, int numero2) {

        return Math.min(numero1, numero2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int opc;
        int num1 = 0;
        int num2 = 0;

        do {

            System.out.println("Quieres operar con reales (1) o enteros (2)");
            System.out.print("> ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:

                    do {

                        System.out.println("Dime un numerin");
                        System.out.print("> ");

                        try {

                            num1 = Integer.parseInt(sc.nextLine());

                            do {

                                System.out.println("Dime OTRO numerin");
                                System.out.print("> ");

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

                    System.out.println("El menor es: " + esMenor(num1, num2));

                    break;

                case 2:

                    break;

                default:

                    System.out.println("Valor Inválido!");

                    break;
            }

        } while (!correcto);


    }
}

package TEMA4.Ejercicios1;
import java.util.Scanner;

public class ej8 {

    public static int esMenor(int numero1, int numero2) {

        return Math.min(numero1, numero2);

    }

    public static double esMenorReal(double numero1, double numero2) {

        return Math.min(numero1, numero2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int opc;

        do {

            System.out.println("Quieres operar con enteros (1) o reales (2) o irte un poquillo a la mierda (0)");
            System.out.print("> ");

            while (!sc.hasNextInt()) {

                System.out.println("Valor Inválido!");
                System.out.print("> ");
                sc.nextLine();

            }
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {

                case 1:

                    do {

                        System.out.println("Dime un numerin");
                        System.out.print("> ");

                        try {

                            int num1 = Integer.parseInt(sc.nextLine());

                            do {

                                System.out.println("Dime OTRO numerin");
                                System.out.print("> ");

                                try {

                                    int num2 = Integer.parseInt(sc.nextLine());
                                    System.out.println("El menor es: " + esMenor(num1, num2));
                                    correcto = true;

                                } catch (NumberFormatException e) {

                                    System.out.println("Valor Inválido!");

                                }

                            } while (!correcto);

                        } catch (NumberFormatException e) {

                            System.out.println("Valor Inválido!");

                        }

                    } while (!correcto);

                    break;

                case 2:

                    do {

                        System.out.println("Dime un numerin");
                        System.out.print("> ");

                        try {

                            double num1 = Double.parseDouble(sc.nextLine());

                            do {

                                System.out.println("Dime OTRO numerin");
                                System.out.print("> ");

                                try {

                                    double num2= Double.parseDouble(sc.nextLine());
                                    System.out.println("El menor es: " + esMenorReal(num1, num2));
                                    correcto = true;

                                } catch (NumberFormatException e) {

                                    System.out.println("Valor Inválido!");

                                }

                            } while (!correcto);

                        } catch (NumberFormatException e) {

                            System.out.println("Valor Inválido!");

                        }

                    } while (!correcto);

                    break;

                case 0:

                    System.out.println("Saliendo...");
                    correcto = true;

                    break;

                default:

                    System.out.println("Valor Inválido!");

                    break;
            }

        } while (!correcto);


    }
}

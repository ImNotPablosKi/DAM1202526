package TEMA4.Ejercicios1;

import java.util.Scanner;

public class ej4 {

    public static void mostrarTabla(int numero) {


        for (int i = 1; i <= 10 ; i++) {

            System.out.println( numero + " X " + i + " = " + (numero * i));

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int num1 = 0;

        do {

            System.out.println("Dime un número y te muestro su tabla :3");
            System.out.print("> ");

            try {

                num1 = Integer.parseInt(sc.nextLine());
                correcto = true;

            } catch (NumberFormatException e) {

                System.out.println("Valor Inválido!");

            }

        } while (!correcto);

        mostrarTabla(num1);

    }
}

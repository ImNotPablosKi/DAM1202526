package pruebas;

import java.util.Scanner;

public class recursivoCreoNose {

    // De aquí pa  siempre
    static int a = 0, b = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do {

            System.out.print("Dime un numerin y te saco la cadena del fibopollas ese\n> ");

            try {

                int num = Integer.parseInt(sc.nextLine());
                if (num < 0) {

                    System.out.println("Dame valores positivos...\n> ");
                    sc.nextLine();

                } else {

                    fibonacci(a, b, num);
                    correcto = true;

                }


            } catch (NumberFormatException e) {

                System.out.println("uhh");

            }

        } while (!correcto);

    }

    public static void fibonacci(int a, int b, int n) {

        if (n == 0) {

            System.out.println("0");

        } else if (n == 1) {

            System.out.println(a);

        } else {

            System.out.print(a + " " + b + " ");
            fibonacci(a += b, a + b, n - 2);

        }

    }

}

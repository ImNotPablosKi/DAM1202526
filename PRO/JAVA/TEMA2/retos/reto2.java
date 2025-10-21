package TEMA2.retos;
import java.util.*;

public class reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        String opt;


        do {
            int num1 = 0;
            int num2 = 0;
            double div = 0;
            double numR = 0;
            double raiz = 0;
            double pot = 0;

            System.out.println("Seleccione la opción deseada: ");
            System.out.println("==============================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raíz Cuadrada");
            System.out.println("6. Potencia / Elevación");
            System.out.println("0. SALIR");

            // Comprobar que no pone una letra
            while (!sc.hasNextInt()){
                System.out.println("Indica un numero subnormal :3");
                sc.next();
            }

            int cosa = sc.nextInt();

            switch (cosa){
                case 1:
                    System.out.println("Introduzca el primer valor");
                    num1 = sc.nextInt();

                    System.out.println("Introduzca el segundo valor");
                    num2 = sc.nextInt();

                    System.out.println("Resultado: " + (num1+num2));

                    System.out.println("Desea volver a calcular? (S/N): ");
                    opt = sc.next();

                    if (opt.equalsIgnoreCase("S")) {
                        exit = false;
                    } else if (opt.equalsIgnoreCase("N")) {
                        exit = true;
                    } else {
                        System.out.println("Valor inválido.");
                        exit = true;
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el primer valor");
                    num1 = sc.nextInt();

                    System.out.println("Introduzca el segundo valor");
                    num2 = sc.nextInt();

                    System.out.println("Resultado: " + (num1-num2));

                    System.out.println("Desea volver a calcular? (S/N): ");
                    opt = sc.next();

                    if (opt.equalsIgnoreCase("S")) {
                        exit = false;
                    } else if (opt.equalsIgnoreCase("N")) {
                        exit = true;
                    } else {
                        System.out.println("Valor inválido.");
                        exit = true;
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el primer valor");
                    num1 = sc.nextInt();

                    System.out.println("Introduzca el segundo valor");
                    num2 = sc.nextInt();

                    System.out.println("Resultado: " + (num1*num2));

                    System.out.println("Desea volver a calcular? (S/N): ");
                    opt = sc.next();

                    if (opt.equalsIgnoreCase("S")) {
                        exit = false;
                    } else if (opt.equalsIgnoreCase("N")) {
                        exit = true;
                    } else {
                        System.out.println("Valor inválido.");
                        exit = true;
                    }
                    break;
                case 4:
                    System.out.println("Introduzca el primer valor");
                    num1 = sc.nextInt();

                    System.out.println("Introduzca el segundo valor");
                    num2 = sc.nextInt();

                    if (num2 == 0) {
                        System.out.println("*WARNING* (FATAL) *WARNING* ABORTANDO: No es posible dividir por 0...");
                    } else {
                        div = (double) num1 / num2;
                        System.out.println("Resultado: " + div);
                    }

                    System.out.println("Desea volver a calcular? (S/N): ");
                    opt = sc.next();

                    if (opt.equalsIgnoreCase("S")) {
                        exit = false;
                    } else if (opt.equalsIgnoreCase("N")) {
                        exit = true;
                    } else {
                        System.out.println("Valor inválido.");
                        exit = true;
                    }
                    break;
                case 5:
                    System.out.println("Introduzca el valor base de la raíz: ");
                    numR = sc.nextDouble();
                    raiz = Math.sqrt(numR);
                    System.out.println("Resultado: " + raiz);

                    System.out.println("Desea volver a calcular? (S/N): ");
                    opt = sc.next();

                    if (opt.equalsIgnoreCase("S")) {
                        exit = false;
                    } else if (opt.equalsIgnoreCase("N")) {
                        exit = true;
                    } else {
                        System.out.println("Valor inválido.");
                        exit = true;
                    }
                    break;
                case 6:
                    System.out.println("Introduzca el valor a elevar: ");
                    num1 = sc.nextInt();

                    System.out.println("Introduzca el exponente: ");
                    num2 = sc.nextInt();

                    pot = Math.pow(num1, num2);
                    System.out.println("Resultado: " + pot);

                    System.out.println("Desea volver a calcular? (S/N): ");
                    opt = sc.next();

                    if (opt.equalsIgnoreCase("S")) {
                        exit = false;
                    } else if (opt.equalsIgnoreCase("N")) {
                        exit = true;
                    } else {
                        System.out.println("Valor inválido.");
                        exit = true;
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Valor Inválido! :C");
                    exit = false;
                    break;
            }
        } while (!exit);

    }
}

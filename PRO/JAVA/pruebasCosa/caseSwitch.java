package pruebasCosa;

import java.util.*;

public class caseSwitch {

    public static void main(String[] args) {
        System.out.println("Dime un numerín vro: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Dime OTRO numerín lil vro: ");
        int num2 = sc.nextInt();

        System.out.println("Escoja su operación: 1(Suma), 2(Resta), 3(Multiplicar), 4(Dividir)");

        int cosa = sc.nextInt();

        switch (cosa) {
            case 1:
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case 4:
                if (num2 > num1) {
                    System.out.println("Fatal: No es posible dividir por 0");
                } else {
                    System.out.println("El resultado es: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Definitivamente usuario TONTO (o profesor cabrón....)");
        }

    }
}

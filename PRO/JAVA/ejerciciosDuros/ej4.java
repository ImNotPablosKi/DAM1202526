package ejerciciosDuros;

import java.util.*;

import static java.lang.Math.sqrt;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pasa un numerín y te digo su raíz cuadrada vro: ");
        int num = sc.nextInt();

        System.out.println("La raíz cuadrada de " + num + " equivale a: " + Math.sqrt(num));
    }
}
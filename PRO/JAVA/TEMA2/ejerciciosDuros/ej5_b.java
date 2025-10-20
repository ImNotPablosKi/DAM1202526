package TEMA2.ejerciciosDuros;

import java.util.*;

public class ej5_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número (POSITIVO PORFA :D) : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Escoje un número positivo, usuario tonto...");
        } else {
            int rando1 = (int) (Math.random() * num);
            int rando2 = (int) (Math.random() * num);
            int rando3 = (int) (Math.random() * num);

            System.out.println("1er número aleatorio entre 0 y " + num + " : " + rando1);
            System.out.println("1er número aleatorio entre 0 y " + num + " : " + rando2);
            System.out.println("1er número aleatorio entre 0 y " + num + " : " + rando3);
        }
    }
}
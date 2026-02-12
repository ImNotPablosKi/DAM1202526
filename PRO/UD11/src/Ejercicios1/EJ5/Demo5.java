package Ejercicios1.EJ5;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Lirili");
        palabras.add("guh");
        palabras.add("grah");
        palabras.add("glup");

        String p1;

        System.out.println(palabras);

        do {

            System.out.println("Dime lo que quieres eliminar");
            p1 = sc.nextLine();

            if (!palabras.contains(p1)) {

                System.out.println("La palabra especificada NO está en la lista");

            } else {

                break;

            }

        } while (true);

        palabras.remove(p1);


        System.out.println("Nueva Lista:");
        System.out.println(palabras);

    }
}

package Pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class probatina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> bote = new ArrayList<>(List.of("Hola", "Caracola", "Six", "Seven"));

        System.out.println("Lista original:");
        System.out.println(bote);

        String p1;
        String sust;

        do {

            System.out.println("Dime que quieres sustituir: ");
            p1 = sc.nextLine();

            if (!bote.contains(p1)) {

                System.out.println("La palabra solicitadoa NO está en la lista!");

            } else {

                break;

            }

        } while (true);

        do {

            System.out.println("Ahora dime por que lo vas a sustituir: ");
            sust = sc.nextLine();

            if (!bote.contains(sust)) {

                System.out.println("La palabra solicitada NO está en la lista!");

            } else {

                break;

            }

        } while (true);

        int index1 = bote.indexOf(p1);
        int indexSustituto = bote.indexOf(sust);

        bote.set(index1, sust);
        bote.set(indexSustituto, p1);

        System.out.println("Nueva Lista: ");
        System.out.println(bote);

        sc.close();

    }
}

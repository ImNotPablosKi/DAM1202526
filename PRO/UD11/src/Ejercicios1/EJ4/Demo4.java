package Ejercicios1.EJ4;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> palabras =  new ArrayList<>();

        palabras.add("Hola");
        palabras.add("Caracola");
        palabras.add("Bum ass");
        palabras.add("Lame fuck");

        String aux;
        String aux2;

        System.out.println(palabras);

        do {

            System.out.println("Dime lo que quieres sustituir");
            aux = sc.nextLine();

            if (!palabras.contains(aux)) {

                System.out.println("Esa palabra NO ESTÁ EN LA LISTA");

            } else {

                break;

            }

        } while (true);

        do {

            System.out.println("Dime lo que quieres poner en su lugar");
            aux2 = sc.nextLine();

            if (!palabras.contains(aux2)) {

                System.out.println("Esa palabra NO ESTÁ EN LA LISTA");

            } else {

                break;

            }

        } while (true);

        int index1 = palabras.indexOf(aux);
        int index2 = palabras.indexOf(aux2);

        palabras.set(index1, aux2);
        palabras.set(index2, aux);

        System.out.println(palabras);

        sc.close();

    }
}

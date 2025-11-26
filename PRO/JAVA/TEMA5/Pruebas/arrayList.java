package TEMA5.Pruebas;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> cosas = new ArrayList<>();

        cosas.add("Chicas");
        cosas.add("Muy Pequeñas");
        cosas.add("Con Tetas");
        cosas.add("Monstruosas");
        cosas.add("Y Diablillas");
        cosas.add("O algo así");

        cosas.remove(5); // O algo Así

        cosas.add(0, "Juegos de");

        for (int i = 0; i < cosas.size() ; i++) {

            System.out.println(cosas.get(i));

        }

        System.out.println();

        System.out.println("Limpiar Lista...");

        cosas.clear();

        if (cosas.size() == 0) { // Se podría usar cosas.isEmpty();

            System.out.println("No hay elementos en la lista");

        }

        // declaramos una lista de números enteros
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // generamos un número aleatorio entre 15 y 20
        int length = (int) (Math.random() * 6 + 15);
        // generamos enteros aleatorios en el rango [0,100)
        // mostramos la lista generada
        for (int i = 0; i < length; i++) {
            int number = (int) (Math.random() * 100);
            numbers.add(number);
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();

        // chequeamos la existencia de los números 1, 5 y 10
        if (numbers.indexOf(1) > -1) {
            System.out.println("El 1 está presente en la lista");
        }
        if (numbers.indexOf(5) > -1) {
            System.out.println("El 5 está presente en la lista");
        }
        if (numbers.indexOf(10) > -1) {
            System.out.println("El 10 está presente en la lista");
        }

        // ordenamos la lista
        Collections.sort(numbers);
        System.out.println();
        System.out.println("Lista ordenada");
        length = numbers.size();
        for (int i = 0; i < length; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}

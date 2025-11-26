package TEMA5.Pruebas;

import java.util.ArrayList;
import java.util.Arrays;

public class toArray {
    public static void main(String[] args) {
        // declaramos un array strings
        String[] a = { "Turia", "Ebro", "Jiloca", "Alfambra" };

        // transformamos el array en una lista
        // pasamos como parámetro el resultado
        // de Arrays.asList

        ArrayList<String> lst =  new ArrayList<String>(Arrays.asList(a));

        lst.add("Tajo");
        lst.add("Duero");
        lst.add("Júcar");

        // obtenemos un array a partir de la lista
        // pasamos como parámetro un array del tipo
        // y tamaño que necesitamos

        a = (String[]) lst.toArray(new String[lst.size()]);

        // recorremos el array y mostramos
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }
    }
}

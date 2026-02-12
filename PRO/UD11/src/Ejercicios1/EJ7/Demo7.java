package Ejercicios1.EJ7;

import java.util.ArrayList;
import java.util.Random;

public class Demo7 {
    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        lista1.add("guh");
        lista1.add("grah");
        lista1.add("glup");
        lista1.add("gasp");

        lista2.add("blip");
        lista2.add("blopp");
        lista2.add("bleh");
        lista2.add("buh");

       lista1.stream().filter(a -> a.contains(a));

    }
}

package Ejercicios1.EJ7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo7 {
    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>(List.of("Ann", "Carol", "Mary", "Joe",
                "John", "Kevin", "Jack", "Jack", "Lucy", "Laura", "George",
                "Ann", "Johnny", "Charlie", "Hillary"));

        ArrayList<String> lista2 = new ArrayList<>(List.of("Ann", "Martha", "Noel",
                "Mark", "Pamela", "Elisabeth", "Laura", "Jane", "Mildred",
                "Laura", "Rue", "Ann", "Jacob", "Sidney", "Sophia", "Tyler"));

//        lista1.stream().filter(lista1::contains).distinct().forEach(System.out::println);
//        lista2.stream().filter(lista2::contains).distinct().forEach(System.out::println);

        System.out.println("Lista de palabras que aparecen en ambas listas:");
        lista1.stream().distinct().filter(lista2::contains).forEach(System.out::println);

        System.out.println("Lista de palabras que aparecen en la primera, pero NO en la segunda:");
        lista1.stream().distinct().filter(palabra -> !lista2.contains(palabra)).forEach(System.out::println);

        System.out.println("Lista de palabras que aparecen en la segunda, pero NO en la primera:");
        lista2.stream().distinct().filter(palabra -> !lista1.contains(palabra)).forEach(System.out::println);

        System.out.println("Palabras que aparecen en cualquiera de ambas listas:");
        ArrayList<String> lista3 = new ArrayList<>();
        lista3.addAll(lista1);
        lista3.addAll(lista2);

        lista3.stream().distinct().forEach(System.out::println);

    }
}

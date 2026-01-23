package UD10_UD08.Ejercicios4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe algo");
        System.out.print("> ");

        Matcher mayus = Pattern.compile("\\b[A-Z]\\w+").matcher(sc.nextLine());

        while (mayus.find()) {

            System.out.print(mayus.group() + " ");

        }

    }
}

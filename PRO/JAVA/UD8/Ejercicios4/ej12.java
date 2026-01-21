package UD8.Ejercicios4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una dirección de correo");
        System.out.print(">");

        Matcher validEmail = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(sc.nextLine());

        if (validEmail.find()) {

            System.out.println("La dirección de correo es válida!");

        } else {

            System.out.println("nuh uh");

        }

    }
}

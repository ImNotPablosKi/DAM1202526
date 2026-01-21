package UD10.Ejercicios4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número de Teléfono (+34 ESP)");
        System.out.print("> ");

        Matcher validPhone = Pattern.compile("\\b\\d{3} \\d{2} \\d{2} \\d{2}\\b").matcher(sc.nextLine());

        if (validPhone.find()) {

            System.out.println("El número de teléfono es válido!");

        } else {

            System.out.println("nuh uh");

        }

    }
}

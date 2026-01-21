package UD10.Ejercicios4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una fecha (dd/mm/YY)");
        System.out.print("> ");

        Matcher fecha = Pattern.compile("^([0-2]\\d|3[0-1])/(0\\d|1[0-2])/(\\d{4})$").matcher(sc.nextLine());

        if (fecha.find()) {

            System.out.println("La fecha es válida!");

        } else {

            System.out.println("repite anda");

        }

    }
}

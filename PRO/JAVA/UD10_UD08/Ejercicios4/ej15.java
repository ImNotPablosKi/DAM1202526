package UD10_UD08.Ejercicios4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una IP estilo jmorenod@iesch.org type shit");
        System.out.print("> ");

        Matcher ip = Pattern.compile("^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$").matcher(sc.nextLine());

        if (ip.find()) {

            System.out.println("La dirección IP proporcionada es válida!");

        } else {

            System.out.println("Al que os dió redes el año pasado...");

        }

    }
}

package UD12.Ejercicios4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una contraseña: ");

        Matcher passwd = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%])\\S{8,}$").matcher(sc.nextLine());

        if (passwd.find()) {

            System.out.println("Contraseña Válida!");

        } else {

            System.out.println("nuh uh");

        }

    }
}

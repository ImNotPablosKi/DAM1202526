package UD08.Ejercicios5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;

        System.out.println("Dame un numerín: ");

        try {

            Integer num = Integer.parseInt(sc.nextLine());

            try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

                String line;
                String veces = String.valueOf(num);

                while ((line = br.readLine()) != null) {

                    Matcher palabras = Pattern.compile("\\b\\w{" + num + "}\\b").matcher(line);

                    while (palabras.find()) {

                        System.out.println(palabras.group());

                    }

                }

            } catch (IOException e) {

                System.out.println("nuh uh");

            }

        } catch (NumberFormatException e) {

            System.out.println("muy buena");

        }



    }
}

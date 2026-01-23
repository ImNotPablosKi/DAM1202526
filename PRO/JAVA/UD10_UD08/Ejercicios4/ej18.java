package UD10_UD08.Ejercicios4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej18 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher letras5 = Pattern.compile("\\b[a-zA-Z]{5,}\\b").matcher(line);

                while (letras5.find()) {

                    System.out.println(letras5.group());

                }

            }

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

    }
}

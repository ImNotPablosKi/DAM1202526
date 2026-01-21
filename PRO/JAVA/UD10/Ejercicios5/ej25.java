package UD10.Ejercicios5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej25 {
    public static void main(String[] args) {

        int wordCounter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher palabra = Pattern.compile("\\b[hH]ola\\b").matcher(line);

                while (palabra.find()) {

                    wordCounter++;

                }

            }

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

        System.out.println(wordCounter);

    }
}

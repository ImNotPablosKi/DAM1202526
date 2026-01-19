package UD12.Ejercicios4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej20 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher specialChars = Pattern.compile("\\w*[@#$%]+\\w+\\b").matcher(line);


                while (specialChars.find()) {

                    System.out.println(specialChars.group());

                }

            }


        } catch (IOException e) {

            System.out.println("nuh uh");

        }

    }
}

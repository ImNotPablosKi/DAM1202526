package UD10.Ejercicios5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej22 {
    public static void main(String[] args) {

        int palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher word = Pattern.compile("\\b.\\b").matcher(line);

                while (word.find()) {

                    palabras++;

                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no Encontrado");

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

        System.out.println(palabras);

    }
}

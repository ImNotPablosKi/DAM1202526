package UD12.Ejercicios3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej8 {
    public static void main(String[] args) {

        File archivo = new File("cosa/EJ5/ej5.txt");
        Pattern patron = Pattern.compile("\\b\\S+\\b"); // Usamos el "\\S" para indicar TODO lo que NO sea un salto de linea

        int count = 0;

        if ( !archivo.exists()) {

            System.out.println("nuh uh (no existe)");

        } else {

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

                String line;

                while ((line = br.readLine()) != null) {

                    Matcher matcher = patron.matcher(line);

                    while (matcher.find()) {

                        count++;

                    }

                    System.out.println(count);

                }

            } catch (Exception e) {

                System.out.println("nuh uh");

            }

        }

    }
}

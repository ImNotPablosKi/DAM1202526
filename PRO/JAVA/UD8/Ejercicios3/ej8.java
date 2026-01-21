package UD8.Ejercicios3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej8 {
    public static void main(String[] args) {

        Pattern patron = Pattern.compile("\\b\\S+\\b"); // Usamos el "\\S" para indicar TODO lo que NO sea un salto de linea

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/EJ5/ej5.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher matcher = patron.matcher(line);

                while (matcher.find()) {

                    count++;

                }

                System.out.println(count);

            }

        } catch (FileNotFoundException e) {

            System.out.println("nuh uh");

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

    }

}


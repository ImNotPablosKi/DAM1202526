package UD8.Ejercicios4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej17 {
    public static void main(String[] args) {

        String cadena = "La temperatura es de 128.90 (xd) grados con las minimas de veinte y máximas de 6767,8";

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                Matcher temp = Pattern.compile("\\b\\d+[.|,]*\\d*\\b").matcher(line);

                while (temp.find()) {

                    System.out.println(temp.group());

                }

            }

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

    }
}

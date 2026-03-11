package Pruebas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SepararStrings {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                for (String s: line.split("\\s")) {

                    System.out.println(s);

                }

            }

        } catch (IOException e) {

            System.out.println("Error de E/S");

        }

    }

}

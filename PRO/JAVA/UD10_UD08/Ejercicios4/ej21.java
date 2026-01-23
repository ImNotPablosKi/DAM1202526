package UD10_UD08.Ejercicios4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej21 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                System.out.println(linea.replaceAll("[aeiouAEIOU]", "*"));

            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no Encontrado");

        } catch (IOException e) {

            System.out.println("nuh uh");

        }


    }
}

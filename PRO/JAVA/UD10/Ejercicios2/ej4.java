package UD10.Ejercicios2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ej4 {
    public static void main(String[] args) {

        System.out.println("Leyendo archivo");

        File archivo = new File("cosa/EJ4/ej4.txt");

        if (!archivo.exists()) {

            System.out.println("El archivo solicitado NO existe!");

        } else {

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))){

                String line;
                while ((line = br.readLine()) != null) {

                    System.out.println(line);

                }

            } catch (Exception e) {

                System.out.println("Se ha producido un error al leer el archivo");

            }

        }

    }
}

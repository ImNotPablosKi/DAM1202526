package UD08.Pruebas;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PruebaLeerBytes {
    public static void main(String[] args) {

        Path ruta = Paths.get("cosa/multiusos.txt");

        try (FileInputStream leer = new FileInputStream("cosa/multiusos.txt"); FileOutputStream escribir = new FileOutputStream("cosa/escribir.txt"))  {

            int data;

            while ((data = leer.read()) != -1) {

                System.out.print((char) data);
                escribir.write(data);

            }

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

    }
}

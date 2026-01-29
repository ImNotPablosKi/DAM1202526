package UD08.Pruebas;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerNormal {
    public static void main(String[] args) {

        try (FileReader leer = new FileReader("cosa/multiusos.txt"); FileWriter escribir = new FileWriter("cosa/escribir.txt")) {

            int datos;

            while ((datos = leer.read())  != -1) {

                System.out.print((char) datos);
                escribir.write(datos);

            }

        } catch (IOException e) {

            System.out.println("uhh");

        }

    }
}

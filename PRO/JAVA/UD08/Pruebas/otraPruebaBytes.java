package UD08.Pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class otraPruebaBytes {

    public static void main(String[] args) {

        try (FileInputStream leer = new FileInputStream("cosa/multiusos.txt"); FileOutputStream escribir = new FileOutputStream("cosa/escribir.txt")) {

            int datos;

            while ((datos = leer.read()) != -1 ) {

                System.out.print((char) datos);
                escribir.write(datos);

            }

        } catch (IOException e) {

            System.out.println("uhh");

        }

    }

}

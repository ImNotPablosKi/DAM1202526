package UD08.Pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerBytesOtraVezXD {

    public static void main(String[] args) {

        Path rutaLectura = Paths.get("cosa/multiusos.txt");
        Path rutaEscritura = Paths.get("cosa/escribir.txt");

        // Añadir true para que haga append, por defecto sobreescribe
        try (FileInputStream leer = new FileInputStream(rutaLectura.toFile()); FileOutputStream escribir = new FileOutputStream(rutaEscritura.toFile(),true)) {

            int datos;

            while ((datos = leer.read()) != -1) {

                System.out.print((char) datos);
                escribir.write(datos);

            }

        } catch (IOException e) {

            System.out.println("uhh");

        }

    }

}

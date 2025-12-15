package UD12.Ejercicios1.Pruebas;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Pasa ruta vro\n>");

        String nuta = sc.nextLine();
        Path miRuta = Paths.get(nuta);

        File miArchivo = new File(miRuta.toString());

        if (miRuta.toString() == null) {

            System.out.println("El directorio NO EXISTE");

        } else {

            System.out.println("La ruta de la subcarpeta en la que se encuentra es: " + miRuta.getParent());

            System.out.println("Existe?: " + miArchivo.exists());

            if (miRuta.toString().contains(".")) {

                System.out.println("Se trata de un fichero.");

            } else {

                System.out.println("Es un directorio");

                for (File i: miArchivo.listFiles()) {

                    System.out.println(i.toString());

                }

            }

        }

    }
}

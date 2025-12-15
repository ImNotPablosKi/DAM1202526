package UD12.Ejercicios1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una ruta\n>");

        String ruta = sc.nextLine();
        Path miRuta = Paths.get(ruta);

        File miArchivo = new File(miRuta.toString());

        if (miRuta.getParent() == null) {

            System.out.println("El fichero NO existe");

        } else {

            System.out.println("El directorio raíz es: " + miRuta.getRoot());

            System.out.println("El archivo se encuentra en: " + miRuta.getParent().toString().substring(miRuta.getParent().toString().lastIndexOf("\\")+1));

            System.out.println("El nombre es: " + miRuta.getFileName());

            System.out.println("La extensión es: " + miRuta.getFileName().toString().substring(miRuta.getFileName().toString().indexOf(".")));

        }

    }
}

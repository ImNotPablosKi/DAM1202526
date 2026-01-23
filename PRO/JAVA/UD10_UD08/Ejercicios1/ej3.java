package UD10_UD08.Ejercicios1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej3 {
    public static void main(String[] args) throws IOException {

        // Para ahorrarme escribir cosas uh
        Path rutaGeneral = Paths.get("cosa/PRO_UD08_Ej03/");

        Path ruta = Paths.get("cosa/PRO_UD08_Ej03/Programacion.txt");
        Path ruta2 = Paths.get("cosa/PRO_UD08_Ej03/Programacion(+1).txt");
        Path ruta3 = Paths.get("cosa/PRO_UD08_Ej03/Programacion(+2).txt");
        Path ruta4 = Paths.get("cosa/PRO_UD08_Ej03/docs/samples");
        Path ruta5 = Paths.get(rutaGeneral + "docs/exercises");

        try {

            Files.copy(ruta, ruta2);
            Files.copy(ruta, ruta3);

        } catch (IOException e) {

            System.out.println("Error de Copia");

        }

        try {

            Files.createDirectories(ruta4);
            Files.createDirectory(ruta5);

        } catch (IOException e) {

            System.out.println("Error de Creación de carpetas");

        }

        try {

            Files.move(ruta2, Paths.get("cosa/PRO_UD08_Ej03/Programacion.txt"));

        } catch (IOException e) {

            System.out.println("Error al renombrar ficheros.");

        }

        try {

            Files.delete(ruta3);

        } catch (IOException e) {

            System.out.println("Error de borrado de archivos");

        }

    }
}

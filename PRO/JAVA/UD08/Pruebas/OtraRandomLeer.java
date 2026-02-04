package UD08.Pruebas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OtraRandomLeer {

    public static void main(String[] args) {

        Path ruta = Paths.get("cosa/multiusos.txt");

        try (RandomAccessFile raf = new RandomAccessFile("cosa/escribir.txt", "rw")) {

            raf.write("jodete muchísimo pedro sanchez".getBytes());
            raf.write("\ncoñete pedete juerga de gitanetes".getBytes());

            raf.seek(0);

            String line;

//            while ((line = raf.readLine()) != null) {
//
//                System.out.println(line);
//
//            }

            int chars;

            while ((chars = raf.read()) != -1) {

                System.out.print((char) chars);

            }

        } catch (IOException e) {

            System.out.println("nuh uhh");

        }

    }

}

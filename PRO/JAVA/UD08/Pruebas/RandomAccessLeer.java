package UD08.Pruebas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessLeer {
    public static void main(String[] args) {

        try (RandomAccessFile raf = new RandomAccessFile("cosa/escribir.txt", "rw")) {

            // raf.seek(8);

            raf.write("Me cago en la puta".getBytes());
            raf.write(" coñete".getBytes());
            raf.write("\nJodete microslop".getBytes());

            String line;

            // Esto hay que ponerlo

            raf.seek(0);

//            while ((line = raf.readLine()) != null) {
//
//                System.out.println(line);
//
//            }

            int data;

            while ((data = raf.read()) != -1 ) {

                System.out.print((char) data);

            }

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

    }
}

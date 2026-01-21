package UD8.Ejercicios5;

import java.io.*;

public class ej23 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter("cosa/target.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                bw.write(line.replaceAll("temperatura", "breva"));

            }

        } catch (IOException e) {

            System.out.println("nuh uh");

        }



    }
}

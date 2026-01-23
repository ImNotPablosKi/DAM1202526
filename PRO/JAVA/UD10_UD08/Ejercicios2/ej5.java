package UD10_UD08.Ejercicios2;

import java.io.*;

public class ej5 {
    public static void main(String[] args) {

        File source = new File("cosa/EJ5/ej5.txt");
        File target = new File("cosa/EJ5/target.txt");

        if (!source.exists() || !target.exists()) {

            System.out.println("El archivo solicitado NO existe!");

        } else {

            try (BufferedReader br = new BufferedReader(new FileReader(source)); BufferedWriter bw = new BufferedWriter((new FileWriter(target)))) {

                System.out.println("Texto Original:");

                String line;

                while ((line = br.readLine()) != null) {

                    System.out.println(line);
                    bw.write(line + "\n");

                }

            } catch (Exception e) {

                System.out.println("Se ha producido un error de lectura");

            }

        }

    }
}

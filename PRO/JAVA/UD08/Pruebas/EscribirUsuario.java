package UD08.Pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribirUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime algo idk");
        System.out.print("> ");

        String texto = sc.nextLine();

        try (FileOutputStream escribir = new FileOutputStream("cosa/escribir.txt")) {

            escribir.write(texto.getBytes());

        } catch (IOException e) {

            System.out.println("uhh");

        }

    }

}

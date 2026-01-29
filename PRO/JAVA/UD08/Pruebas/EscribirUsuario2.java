package UD08.Pruebas;

import java.io.*;
import java.util.Scanner;

public class EscribirUsuario2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======= ESCOGE =======");

        System.out.println("1. Leer Fichero");
        System.out.println("2. Escribr en Fichero");
        System.out.println("3. Ambas xd");
        System.out.println("4. 10 to the chest");

        int opc = sc.nextInt();

        switch (opc) {

            case 1:

                try (BufferedReader br = new BufferedReader(new FileReader("cosa/multiusos.txt"))) {

                    String line;

                    System.out.println("Esto es lo que hay en el fichero:");
                    System.out.println("=================================");

                    while ((line = br.readLine()) != null) {

                        System.out.println(line);

                    }

                } catch (IOException e) {

                    System.out.println("nuh uhh");

                }

                break;
            case 2:

                System.out.println("Dime algo lilbrover");
                System.out.print("> ");

                String texto = sc.nextLine();

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("cosa/escribir.txt"))) {

                    bw.write(texto);

                } catch (IOException e) {

                    System.out.println("nuh uh");

                }

                break;
            case 3:

                try (BufferedReader br = new BufferedReader(new FileReader("cosa/escribir.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter("cosa/escribir.txt"))) {

                    String line;

                    System.out.println("Esto es lo que hay en el fichero:");
                    System.out.println("=================================");

                    while ((line = br.readLine()) != null) {

                        System.out.println(line);

                    }

                    System.out.println("Dime algo lilbrover");
                    System.out.print("> ");

                    sc.nextLine();
                    String cosa = sc.nextLine();

                    bw.write(cosa);

                    System.out.println("Y esto es lo que hay ahora:");
                    System.out.println("===========================");

                    while ((line = br.readLine()) != null) {

                        System.out.println(line);

                    }

                } catch (IOException e) {

                    System.out.println("nuh uhh");

                }

                break;
            case 4:
                System.out.println("Pa casica");
                break;
        }



    }
}

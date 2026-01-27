package UD08.Ejercicios3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej10 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/CSV/DATA.csv"))) {

            String line;

            System.out.println("Registros de dominios Españoles o Portugueses: ");
            while ((line = br.readLine()) != null) {

                Matcher pais = Pattern.compile("\\bES|PT\\b").matcher(line);

                if (pais.find()) {

                    System.out.println(line);

                }

            }

            System.out.println("Registros con handle '.edu': ");
            while ((line = br.readLine()) != null) {

                Matcher edu = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.edu").matcher(line);

                if (edu.find()){

                    System.out.println(line);

                }

            }

            System.out.println("Registros con handle '@yahoo': ");
            while ((line = br.readLine()) != null) {

                Matcher yahoo = Pattern.compile("@yahoo").matcher(line);

                if (yahoo.find()){

                    System.out.println(line);

                }

            }

            System.out.println("Registros con un login entre Mayo de 2015 y Febrero de 2017");
            while ((line = br.readLine()) != null) {

                Matcher login = Pattern.compile("201[5-7]-0[2-5]-\\d{2}").matcher(line);

                if (login.find()) {

                    System.out.println(line);

                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("nuh uh");

        } catch (IOException e) {

            System.out.println("nuh uh");

        }

    }
}

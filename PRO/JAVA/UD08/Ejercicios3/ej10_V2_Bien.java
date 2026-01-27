package UD08.Ejercicios3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej10_V2_Bien {
    public static void main(String[] args) {

        System.out.println("Registros de España y Portugal");
        buscar("\\bES|PT\\b");
        System.out.println();

        System.out.println("Registros de dominio '.edu': ");
        buscar("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.edu");
        System.out.println();

        System.out.println("Registros de email '@yahoo'");
        buscar("@yahoo");
        System.out.println();

        System.out.println("Registros de Login realizados entre Mayo de 2015 y Febrero de 2017");
        buscar(",2015-0[5-9]-|,2015-[10-12]-|,2016-[0-9]{2}-|,2017-0[0-2]-");

    }

    public static void buscar(String regex) {

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/CSV/DATA.csv"))){

            String line;

            while ((line = br.readLine()) != null) {

                Matcher pais = Pattern.compile(regex).matcher(line);

                if (pais.find()) {

                    System.out.println(line);

                }

            }

        } catch (FileNotFoundException e) {

            System.out.println("nuh uhh");

        } catch (IOException e) {

            System.out.println("nuh uhh");

        }

    }
}

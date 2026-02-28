package Pruebas.Sufrida;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.util.ArrayList;
import java.util.Comparator;

public class DemoSufridica {
    public static void main(String[] args) {

        ArrayList<Registro> registros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/DATA.csv"))) {

            String line;

            // La primera linea no cuenta porque no contiene datos
            boolean fst = true;

            while ((line = br.readLine()) != null) {

                if (!fst) {

                    String[] campos = line.split(",");

                    // Bombazo de regex para no hacer 3 arrays distintos, lo separa todo perfectamente
                    String[] fechaYhora = campos[9].split("[: -]");

                    LocalDate date = LocalDate.of(Integer.parseInt(fechaYhora[0]), Integer.parseInt(fechaYhora[1]), Integer.parseInt(fechaYhora[2]));
                    LocalTime time = LocalTime.of(Integer.parseInt(fechaYhora[3]), Integer.parseInt(fechaYhora[4]), Integer.parseInt(fechaYhora[5]));

                    registros.add(new Registro(Integer.parseInt(campos[0]), campos[1], campos[2], Double.parseDouble(campos[3]), Double.parseDouble(campos[4]), campos[5], campos[6], campos[7], campos[8], LocalDateTime.of(date, time)));

                }

                fst = false;

            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no encontrado o corrupto");

        } catch (IOException e) {

            System.out.println("Error de E/S");

        }

        System.out.println("Registros de Francia");
        registros.stream().filter(registro -> registro.getCountry().equalsIgnoreCase("FR")).forEach(System.out::println);

        System.out.println("Registros de Yahoo");
        registros.stream().filter(registro -> registro.getEmail().contains("@yahoo")).sorted(Comparator.comparing(Registro::getFirstName)).forEach(System.out::println);

        System.out.println("Logins Entre 2015 y 2017");
        registros.stream().filter(registro -> registro.getLast_login().isAfter(LocalDateTime.of(2015, 01, 01, 0, 0)) && registro.getLast_login().isBefore(LocalDateTime.of(2017, 01, 01, 0, 0)));

        System.out.println("Nombres que empiezan por A");
        // registros.stream().sorted(Comparator.comparing(Registro::getLast_login)).filter(registro -> registro.getFirstName().startsWith("A"));
        registros.stream().filter(registro -> registro.getFirstName().startsWith("A")).map(registro -> registro.getFirstName() + " " + registro.getLastName()).forEach(System.out::println);

    }
}

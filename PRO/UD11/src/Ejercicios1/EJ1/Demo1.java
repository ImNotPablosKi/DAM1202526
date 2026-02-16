package Ejercicios1.EJ1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<Registro> registry = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("cosa/DATA.csv"))) {

            String line;

            // La primera línea no cuenta pq es el indicador del nombre de cada campo.
            boolean primera = true;

            while ((line = br.readLine()) != null) {

                if (!primera) {

                    String campos[] = line.split(",");
                    String fechaYhora[] = campos[9].split(" ");
                    String fecha[] = fechaYhora[0].split("-");
                    String hora[] = fechaYhora[1].split(":");

                    LocalDate date = LocalDate.of(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
                    LocalTime time = LocalTime.of(Integer.parseInt(hora[0]), Integer.parseInt(hora[1]), Integer.parseInt(hora[2]));

                    registry.add(new Registro(Integer.parseInt(campos[0]), campos[1], campos[2], Double.parseDouble(campos[3]), Double.parseDouble(campos[4]), campos[5], campos[6], campos[7], campos[8], LocalDateTime.of(date, time)));

                }

                primera = false;

            }

        } catch (FileNotFoundException e) {

            System.out.println("No se encontró el archivo requerido");

        } catch (IOException e) {

            System.out.println("Error de E/S");

        }

        // registry.forEach(System.out::println);

//        for (Registro r: registry) {
//
//            System.out.println(r.getCountry());
//
//        }

        System.out.println("REGISTROS DE FRANCIA (.equalsIgnoreCase)");
        System.out.println("---------------------------------------------");
        registry.stream().filter(registro -> registro.getCountry().equalsIgnoreCase("FR")).forEach(System.out::println);

        System.out.println("REGISTROS DE YAHOO (.contains)");
        System.out.println("---------------------------------------------");
        registry.stream().filter(registro -> registro.getEmail().contains("@yahoo")).sorted(Comparator.comparing(Registro::getFirstName)).forEach(System.out::println);

        System.out.println("LOGINs ENTRE NOV-2015 & JAN-2017 (.isAfter // .isBefore)");
        System.out.println("---------------------------------------------");
        registry.stream().filter(registro -> registro.getLast_login().isAfter(LocalDateTime.of(2015,11,1,0,0)) && registro.getLast_login().isBefore(LocalDateTime.of(2017,01,1,0,0))).forEach(System.out::println);

        // registry.stream().filter(registro -> ChronoPeriod.between("2015-11-01"))

        System.out.println("REGISTROS DE NOMBRES QUE COMIENZAN POR 'A' (.startsWith)");
        System.out.println("---------------------------------------------");
        registry.stream().sorted(Comparator.comparing(Registro::getLast_login).reversed()).filter(registro -> registro.getFirstName().startsWith("A")).map(registro -> registro.getFirstName() + " " + registro.getLastName()) .forEach(System.out::println);
    }
}

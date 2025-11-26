package TEMA5.Pruebas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class localDateTime {
    public static void main(String[] args) {
        // obtenemos fecha y hora del sistema
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // obtenemos una fecha hora concreta
        // a partir de sus elementos
        LocalDateTime newYear = LocalDateTime.of(2020, 01, 01, 00, 00, 00);
        System.out.println(newYear);

        // a partir de una fecha y una hora
        LocalDate lunes = LocalDate.parse("2019-11-25");
        LocalTime clase = LocalTime.of(18, 40);
        LocalDateTime claseLunes = LocalDateTime.of(lunes, clase);
        System.out.println(claseLunes);

        // calculamos periodos de tiempo
        System.out.println("Faltan " + ChronoUnit.HOURS.between(now, claseLunes)
                + " horas para la clase del lunes");
        System.out.println("Faltan " + ChronoUnit.DAYS.between(now, newYear)
                + " horas para año nuevo");

        // a partir de una cadena de texto
        LocalDateTime holidays = LocalDateTime.parse("2019-12-19T21:20");
        System.out.println(holidays);

        // obtenemos el dia de la semana
        System.out.println("Empezamos las vacaciones en "
                + holidays.getDayOfWeek());

    }
}
package TEMA5.Pruebas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class fechaHora {
    public static void main(String[] args) {
        /* LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate date1 = LocalDate.of(1984, Month.NOVEMBER,8);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2011-04-25");
        System.out.println(date2); */

        LocalDate localDate = LocalDate.now();

        // calcular la fecha sumando 3 días
        // a partir de hoy
        System.out.println(localDate.plusDays(3));

        // calcular la fecha de hace 2 meses
        // desde hoy
        System.out.println(localDate.minusMonths(2));

        // mostrar el día de la semana
        System.out.println(localDate.getDayOfWeek());

        // mostrar el día del mes
        System.out.println(localDate.getDayOfMonth());

        // obtener el mes de una fecha
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());

        // obtener el año
        System.out.println(localDate.getYear());

        // comparar 2 fechas
        LocalDate date1 = LocalDate.of(1989, Month.NOVEMBER, 8);
        System.out.println(localDate + " es antes de " + date1
                + ": " + localDate.isBefore(date1));
        System.out.println(localDate + " es después de " + date1
                + ": " + localDate.isAfter(date1));

        // Calcular el period transcurrido entre 2 fechas
        // años
        System.out.println(Period.between(date1, localDate).getYears());

        // días del mes
        System.out.println(
                Period.between(
                        LocalDate.parse("2019-09-13")
                        , LocalDate.parse("2019-12-20")
                ).getDays());

        // días del año
        System.out.println(
                ChronoUnit.DAYS.between(LocalDate.parse("2019-09-13")
                        , LocalDate.parse("2019-12-20")));

    }
}

package TEMA5.Pruebas;

import java.time.LocalTime;

public class localTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime t1 = LocalTime.of(15, 25, 35);
        System.out.println(t1);

        LocalTime t2 = LocalTime.parse("06:30:00");
        System.out.println(t2);

        // obtenemos objeto con las 9 y media
        LocalTime t3 = LocalTime.of(9, 30);
        System.out.println(t3);

        // añadimos 3 horas
        System.out.println(t3.plusHours(3));

        // restamos 30 minutos
        System.out.println(t3.minusMinutes(30));

        // comparamos dos tiempos
        LocalTime t4 = LocalTime.parse("06:30");
        System.out.println(t3 + " es antes que " + t4 + ": " + t3.isBefore(t4));

        // obtenemos la hora
        System.out.println(t4.getHour());

        // obtenemos los minutos
        System.out.println(t4.getMinute());

    }
}

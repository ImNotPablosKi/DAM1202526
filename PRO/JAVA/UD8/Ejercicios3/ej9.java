package UD8.Ejercicios3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej9 {
    public static void main(String[] args) {

        String text = """
                IES SEGUNDO DE CHOMÓN
                C/ Pablo Monguió, 48
                44002 Teruel
                Teléfono: 978 60 13 21
                Fax: 978 60 00 80
                Email: iesschteruel@educa.aragon.es
                Web: www.iesch.org
                """;

        Matcher email = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(text);

        Matcher postal = Pattern.compile("\\b\\d{5}\\b").matcher(text);

        Matcher phone = Pattern.compile("\\b\\d{3} \\d{2} \\d{2} \\d{2}\\b").matcher(text);

        Matcher web = Pattern.compile("[w]{3}\\.[a-zA-Z]+\\.[a-zA-Z]{2,}").matcher(text);

        if (email.find()) {

            System.out.println("Email: " + email.group());

        }

        if (postal.find()) {

            System.out.println("Código Postal: " + postal.group());

        }

        if (phone.find()) {

            System.out.println("Tfno: " + phone.group());

        }

        if (web.find()) {

            System.out.println("Página Web: " + web.group());

        }


    }
}

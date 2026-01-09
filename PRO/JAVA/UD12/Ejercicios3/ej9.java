package UD12.Ejercicios3;

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

        Pattern email = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        Pattern postal = Pattern.compile("\\d{5}");

        

    }
}

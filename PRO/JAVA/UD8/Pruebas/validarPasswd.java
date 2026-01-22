package UD8.Pruebas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validarPasswd {
    public static void main(String[] args) {

        String texto = "Hola esto es un texto convencional, mi password es: 12345678Nigger<>auswitchz para el correo niggers@kkk.me";

        Matcher passwd = Pattern.compile("(?=\\S*[A-Z])(?=\\S*[^a-zA-Z0-9\\s])(?=\\S*\\d)\\S{8,}").matcher(texto);
        Matcher email = Pattern.compile("\\b(?=.*[a-zA-Z]]{3,})@(?=.*[a-z]{3,})\\.[a-z]{2,3}]\\b").matcher(texto);
        Matcher contiene = Pattern.compile("(?=.*a)").matcher(texto);

        while (passwd.find()) {

            System.out.println(passwd.group());

        }

        while (email.find()) {

            System.out.println(email.group());

        }

        while (contiene.find()) {

            System.out.println(contiene.group());

        }

    }
}

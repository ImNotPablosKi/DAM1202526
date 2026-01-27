package UD08.Ejercicios3;

public class ej11 {
    public static void main(String[] args) {

        String cosa = "Hola     esto es una cadena        de caráceres";

        cosa.trim();

        String cosaBien = cosa.replaceAll("\\b +\\b", " ");

        System.out.println(cosaBien);

    }
}

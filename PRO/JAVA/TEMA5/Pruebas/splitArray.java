package TEMA5.Pruebas;

public class splitArray {
    public static void main(String[] args) {
        String phrase1 = "The String class represents character Strings...";
        String phrase2 = "The class String includes methods "
                + "for examining individual characters of the "
                + "sequence, for comparing strings, for "
                + "searching strings, for extracting substrings"
                + ", and for creating a copy of a string with "
                + "all characters translated to uppercase or "
                + "to lowercase";

        // dividimos la primera frase por los espacios
        // obtendremos un array con las palabras que contiene

        String[] words = phrase1.split(" ");

        for (int i = 0; i < words.length; i++) {

            System.out.println(words[i]);

        }

        System.out.println();

        // dividimos la segunda frase por las comas
        // de manera que obtenemos un array que
        // contiene como elmentos las oraciones
        // sububordinada de la frase

        String[] sentences = phrase2.split(",");

        for (String sentence : sentences) {

            System.out.println(sentence);

        }



    }
}

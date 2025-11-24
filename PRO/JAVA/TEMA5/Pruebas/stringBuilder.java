package TEMA5.Pruebas;

public class stringBuilder {
    public static void main(String[] args) {

        // creamos un objeto StringBuilder a partir de una cadena
        StringBuilder sb = new StringBuilder("hello");

        // modificamos un caracter individual
        sb.setCharAt(0, 'H');

        // añadimos un nuevo caracter
        sb.append('!');

        // insertamos un string en la posicion que necesitamos
        sb.insert(5, "world");

        // insertamos un guión tras "Hello"
        sb.insert(5, "-");
        System.out.println(sb.toString());

        // reemplazamos el guión por un espacio
        sb.replace(5, 6, " ");
        System.out.println(sb.toString());

        // borramos el signo de exclamación
        sb.deleteCharAt(sb.length() - 1);

        // damos la vuelta a la cadena
        sb.reverse();
        System.out.println(sb.toString());

    }
}

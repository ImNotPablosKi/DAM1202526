package TEMA5.Pruebas;

public class replaceEqualsCompare {
    public static void main(String[] args) {

        String str = "Hello world!";
        System.out.print("Hello world!");

        System.out.println(" <-- Se va a reemplazar Hello por Bye Bye");
        System.out.println();

        System.out.println(str.replace("Hello", "Bye, bye,"));

        System.out.println("gobernment".replace("b","v"));

        System.out.println();

        // --------------------------------------------------------------------------- //


        String strMayus = "HELLO WORLD!";

        System.out.println(str.equals(strMayus)); // false
        System.out.println(str.equalsIgnoreCase(strMayus)); // true

        System.out.println("A".compareTo("B")<0);
        System.out.println("B".compareTo("B")==0); // Compara la diferencia, 0 significando que son iguales.
        System.out.println("C".compareTo("B")>0);

        String s = String.valueOf(5); // Convierte a cadena

    }
}

package TEMA5.Pruebas;

public class arrayCosaString {
    public static void main(String[] args) {
        char cosas[] = {'H','o','l','a'};

        String cosa1 = new String(cosas);
        String cosa2 = new String(cosas);

        System.out.println(cosa1 == cosa2); // false

        System.out.println(cosa1.equalsIgnoreCase(cosa2)); // true
    }
}

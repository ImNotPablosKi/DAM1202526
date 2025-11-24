package TEMA5.Pruebas;

public class stringIndexContains {
    public static void main(String[] args) {
        String cosa = " Putilla Java Ardilla Cangrejo Esponja Pat(rick) ";

        System.out.println( "Contiene 'rick' ?: " + cosa.contains("rick") );

        int pos = cosa.indexOf('a');
        System.out.println("La PRIMERA a aparece en la posición: " + pos);

        pos = cosa.indexOf('a', pos+1);
        System.out.println("La SEGUNDA a  aparece en la posición: " + pos);

        pos = cosa.lastIndexOf('a');
        System.out.println("La ÚLTIMA a aparece en la posición: " + pos);

        String word1 = cosa.substring(0, 10); // Coge del 0 hasta el 10 SIN INCLUIRLO

        String word2 = cosa.substring(10); // Coge del 10 Hasta el Final...

    }
}

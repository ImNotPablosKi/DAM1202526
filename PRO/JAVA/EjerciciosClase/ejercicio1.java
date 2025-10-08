package EjerciciosClase;
import java.util.*;
public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        /* int dividendo = 30;
        int divisor = 6;
        int d = dividendo / divisor;
        System.out.println("La division de " + dividendo + " y " + divisor + " es igual a: " + d); */

        System.out.println("EJERCICIOS CLASE: ");

        System.out.println("Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.");
        float pi = 3.1459F; // Pongo la F para indicar que es FLOAT y no me explote...
        int r;

        System.out.println("Cuanto vale el radio bro?");
        Scanner leer = new Scanner(System.in); // Para crear una lectura nos declaramos este yappuccino de aquí
        r = leer.nextInt(); // Para finalizar la lectura declaramos que la variable es igual a el nombre del scanner con nextInt (o nextFloat si es decimal);
        System.out.println("La longitud es: " + pi*2*r);
    }
}
package EjerciciosClase;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        float pi = 3.1459F;
        int r;
        System.out.println("Cuanto vale el radio?: ");
        Scanner leer = new Scanner(System.in);
        r = leer.nextInt();
        System.out.println("El radio es de: " + pi*(r*r));
    }
}

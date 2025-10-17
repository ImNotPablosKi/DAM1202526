package ejerciciosDuros;
import java.util.*;

public class ej5_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número mínimo positivo vrv: ");
        int min = sc.nextInt();

        System.out.println("Ahora el máximo, venga: ");
        int max = sc.nextInt();

        if (min < 0 || max < 0) {
            System.out.println("HE DICHO NUMEROS POSITIVOS, CATETO");
        } else if (min == max) {
            System.out.println("Pero si los números son iguales como cojones quieres que haga un random, imbécil.");
        } else {
            /*Por alguna razón en el for no se admiten iguales, por lo que debes poner siempre un menor a [numero que toque]
            (En mi caso quiero que se repita 3 veces --> menor que 3, (0,1 y 2)*/
            for (int i = 0; i < 3 ; i++) {
                int cosa = (int) (Math.random() * (max - min) + min);
                System.out.println("El numero aleatorio " + i + " es: " + cosa);
            }
        }
    }
}
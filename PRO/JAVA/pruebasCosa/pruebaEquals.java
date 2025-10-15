package pruebasCosa;

import java.util.*;

public class pruebaEquals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una palabrilla random twin: ");
        String cosa1 = sc.next();
        System.out.println("Dime alguna otra cosilla venga: ");
        String cosa2 = sc.next();

        // Esta cosa de aquí omite mayúsculas y tal
        System.out.println("Son Iguales ambas cadenas? --> " + (cosa1.equalsIgnoreCase(cosa2)));

        // Esta otra cosilla SI QUE FUERZA a reconocer mayúsculas
        System.out.println("Vale pero, son EXACTAMENTE IGUALES? --> " + (cosa1.equals(cosa2)));
    }
}

package EJ2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        // Pedir y almacenar numeros
        for (int i = 0; i < 5; i++) {

            System.out.println("Dame un numero");
            int num = sc.nextInt();

            nums.add(num);

        }

        // Array auxiliar
        ArrayList<Integer> aux = new ArrayList<>(nums);
        aux.sort(Comparator.naturalOrder());

        // Contador
        int j = 0;

        for (int i = 0; i < nums.size(); i++) {

            // Si equivale al array ordenado, entonces que lo cuente
            if (aux.get(i) == nums.get(i)) {

                j++;

            }

        }

        // Printear solución
        if (j == 5) {

            System.out.println("Están ordendos");

        } else {

            System.out.println("No están ordenados");

        }

        // Cierre del scanner
        sc.close();

    }
}

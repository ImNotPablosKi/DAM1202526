package Ejercicios1.EJ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rando = new Random();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 50; i++) {

           nums.add(rando.nextInt(0, 99));

        }

        System.out.println(nums);

        int opc;

        do {

            try {

                System.out.println("Mete un numerin entre 0 y 99: ");
                opc =  Integer.parseInt(sc.nextLine());

                if (opc < 0 || opc > 99) {

                    System.out.println("El número DEBE estar entre 0 y 99 !");

                } else {

                    break;

                }

            } catch (NumberFormatException e) {

                System.out.println("Número Inválido");

            }

        } while (true);

        int temp = opc;

        System.out.println("El numero " + temp + " aparece " + nums.stream().filter(a -> a == temp).count() + " veces.");

        sc.close();

    }
}

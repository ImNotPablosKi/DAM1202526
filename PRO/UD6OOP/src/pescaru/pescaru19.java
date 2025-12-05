package pescaru;

import java.util.Scanner;

public class pescaru19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame numerines");

        String numeros = sc.next();
        sc.nextLine();

        String[] nums = numeros.split(",");

        Integer suma = 0;

        for (String i: nums) {

            suma += Integer.valueOf(i);

        }

        System.out.println(suma);

    }
}

package ejerciciosClase;

import java.util.Scanner;

public class noseque {

    public static void main(String[] args) {

        System.out.print("Dime un numerin bro: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Ese número sumado a si mismo es: " + (num + num));
    }
}

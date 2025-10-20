package TEMA2.retos;
import java.util.*;

public class reto1 {
    public static void main(String[] args) {
        // kms xd

        Scanner sc = new Scanner(System.in);
        int rando = (int) (Math.random()*100);
        int num;
        int intentos = 0;

        boolean w;
        boolean exit = false;
        boolean repetir = false;

        String comeback;

        do {
            // Se debe inicializar el false aquí por cojones. Si no, repite el mensaje de 'Enhorabuena!'.
            w = false;
            System.out.println("Adivina adivinanza... : ");
            num = sc.nextInt();
            if (num == rando) {
                w = true;
            } else {
                intentos = intentos+1;
            }

            if (w) {
                if (intentos <= 5) {
                    System.out.println("Increíble! Tan solo le ha tomado un total de: " + (intentos+1) + " intentos!");
                } else if (intentos >= 6 && intentos <= 10) {
                    System.out.println("Muy Bien! Le ha tomado un total de: " + (intentos+1) + " intentos!");
                } else if (intentos > 10) {
                    System.out.println("Sigue practicando... Has acertado, pero con un total de: " + (intentos+1) + " intentos...");
                }

                System.out.println("Desea usted jugar de nuevo? :D [s/n]: ");
                comeback = sc.next();
                if (comeback.equalsIgnoreCase("S")) {
                    intentos = 0;
                    repetir = true;
                    rando = (int) (Math.random()*100);

                } else if (comeback.equalsIgnoreCase("N")) {
                    intentos = 0;
                    exit = true;
                    repetir = false;
                } else {
                    System.out.println("que cojones has puesto");
                }
            } else {
                if (num != rando) {
                    if (num > 100 || num < 1) {
                        System.out.println("Imbécil. De UNO (1) a CIEN (100)");
                    } else if (rando > num) {
                        System.out.println("El número introducido es menor al resultado.");
                    } else {
                        System.out.println("El número introducido es mayor al resultado.");
                    }
                }
            }
        } while (!exit || repetir);


    }
}

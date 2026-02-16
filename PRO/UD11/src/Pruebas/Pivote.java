package Pruebas;

import java.util.ArrayList;
import java.util.Random;

public class Pivote {

    public static Integer ordenarParticion(int array[], int bajo, int alto) {

        // Pivote
        int pivote = array[alto];

        int i = (bajo-1); // Índice inicial del elemento más pequeño

        for (int j = bajo; j <= alto; j++) {

            // Si el ELEMENTO ACTUAL es MÁS PEQUEÑO que el pivote:
            if (array[j] < pivote) {

                i++; // Índice de incremento del elemento más pequeño
                array[i] = array[j];

            }

        }

        array[i+1] = array[alto];

        return (i+1);

    }


    public static void main(String[] args) {

        int nums[] = new int[10];

        Random rando = new Random();

        for (int i = 0; i < nums.length; i++) {

            nums[i] = rando.nextInt(1, 100);

        }

    }

}

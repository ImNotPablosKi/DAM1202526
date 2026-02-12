package Ejercicios1.EJ6;

import java.util.ArrayList;
import java.util.Random;

public class Demo6 {
    public static void main(String[] args) {

        Random rando = new Random();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 30 ; i++) {

            int aux = rando.nextInt(    0,99);

            if (!nums.contains(aux)) {

                nums.add(aux);

            }

        }

        System.out.println(nums);

    }
}

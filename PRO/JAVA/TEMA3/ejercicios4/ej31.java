package TEMA3.ejercicios4;
import java.util.*;

public class ej31 {
    public static void main(String[] args) {

        int max = 0;
        int min = 100;
        int num;

        for (int i = 0; i < 10 ; i++) {
            num = (int) (Math.random() * 100);
            System.out.println(num);
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        System.out.println("El máximo ha sido: " + max);
        System.out.println("El mínimo ha sido: " + min);
    }
}

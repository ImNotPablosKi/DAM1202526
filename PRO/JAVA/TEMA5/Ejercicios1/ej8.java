package TEMA5.Ejercicios1;

public class ej8 {
    public static void main(String[] args) {
        int[] rando1 = new int[10];
        int[] rando2 = new int[10];

        System.out.println("Array 1:");

        for (int i = 0; i < rando1.length ; i++) {

            rando1[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11));
            System.out.print(rando1[i] + " ");

        }

        System.out.println();
        System.out.println("Array 2:");

        for (int i = 0; i < rando2.length ; i++) {

            rando2[i] = (int) (Math.random() * (10 - (-11) + 1) + (-11));
            System.out.print(rando2[i] + " ");

        }

        int[] randoSuma = new int[10];

        System.out.println();
        System.out.println("Array Sumado: ");

        for (int i = 0; i < randoSuma.length ; i++) {

            randoSuma[i] = rando1[i] + rando2[i];
            System.out.print(randoSuma[i] + " ");

        }

    }
}

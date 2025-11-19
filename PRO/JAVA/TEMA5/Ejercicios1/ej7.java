package TEMA5.Ejercicios1;

public class ej7 {
    public static void main(String[] args) {
        int[] rando = new int[10];

        System.out.println("Array original: ");

        for (int i = 0; i < rando.length ; i++) {

            rando[i] = (int) (Math.random() * (10 - (-11) + 1 ) + (-11) );
            System.out.print(rando[i] + " ");

        }

        System.out.println();
        System.out.println("Array ABSOLUTO: ");

        for (int i = 0; i < rando.length ; i++) {

            rando[i] = Math.abs(rando[i]);
            System.out.print(rando[i] + " ");

        }

    }
}

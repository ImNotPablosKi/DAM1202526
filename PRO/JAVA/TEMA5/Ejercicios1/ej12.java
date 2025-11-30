package TEMA5.Ejercicios1;

import java.util.Arrays;

public class ej12 {

    // Turbosufridica

    public static int createRandom(int largo, int min, int max) {

        int[] rando = new int[largo];

        for (int i = 0; i < rando.length ; i++) {

            rando[i] = (int) (Math.random() * (max - (min+1) + 1) + (-min+1));

        }

        return rando[largo-1];

    }

    public static void  showArray(int[] a) {

        for (int j : a) {

            System.out.print(j);

        }

    }

    public static int find(int[] a, int buscar) {

        int aux = 0;


        for (int j : a) {

            if (buscar == j) {

                aux = j;

            } else {

                return -1;

            }

        }

        return aux;

    }

    public static int findIndex(int[] a, int buscar, int fromIndex) {

        int aux = 0;


        for (int j : a) {

            if (buscar == j && buscar > fromIndex) {

                aux = j;

            } else {

                return -1;

            }

        }

        return aux;

    }

    public static int getMin(int[] a) {

        Arrays.sort(a);

        return a[0];

    }

    public static int getMax(int[] a) {

        Arrays.sort(a);

        int last = a.length;

        return a[last-1];

    }

    public static int getSuma(int[] a) {

        int suma = 0;

        for (int i : a) {

            suma += i;

        }

        return suma;

    }

    public static double getAvg(int[] a) {

        int suma = 0;
        int contador = 0;

        for (int i : a) {

            suma += i;
            contador++;

        }

        return (double) suma /contador;

    }

    public static double[] getStats(double[] a) {

        double suma = 0;
        int contador = 0;
        int last = a.length;

        Arrays.sort(a);

        for (double i : a) {

            suma += i;
            contador++;

        }

        double media = suma / contador;

        double[] stats = new double[4];

        stats[0] = suma;

        stats[1] = media;

        stats[2] = a[0];

        stats[3] = a[last-1];

        return stats;
    }

    public static void main(String[] args) {

    }
}

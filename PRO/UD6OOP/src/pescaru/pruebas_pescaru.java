package pescaru;

public class pruebas_pescaru {
    public static void main(String[] args) {

        // uh

        String holaMundo = "Hola Mundo";

        String ciudades = "Mmmmmmmatajudíos, Matamoros, Matagitanos";

        System.out.println(holaMundo.substring(5));

        System.out.println(holaMundo.trim()); // what da helly, para reecortar si hay espacios

        System.out.println(holaMundo.toLowerCase() + " " + holaMundo.toUpperCase());

        String[] ciudadesSeparadas = ciudades.split(",");

        for (String i: ciudadesSeparadas) {

            System.out.println(i);

        }

        StringBuilder helloWorld = new StringBuilder(holaMundo);
        StringBuilder ciudades2 = new StringBuilder(ciudades);


        helloWorld.append("!");
        helloWorld.replace(0, 4, "Adios");
        helloWorld.delete(5, 11);

        for (int i = 0; i < ciudades2.length() ; i++) {

            if (ciudades2.charAt(i) == 'm' || ciudades2.charAt(i) == 'M') {

                ciudades2.deleteCharAt(i);
                i--;

            }

        }

        System.out.println(ciudades2);

        System.out.println(helloWorld);

        fibo(11);

        System.out.println();
        System.out.println(factorial(5));
        System.out.println(fiboRecu(11));

    }

    public static void fibo(int num) {

        int contador = 2;
        int numFibo = 0;
        int numAtras= 1;
        int numAtrasAtras = 1;

        System.out.print("1 1 ");

        while (contador != num) {

            numFibo = numAtras + numAtrasAtras;
            numAtrasAtras = numAtras;
            numAtras = numFibo;
            System.out.print(numFibo + " ");
            contador++;

        }

    }

    public static int fiboRecu(int num) {

        if (num <= 1) {

            return num;

        } else {

            return fiboRecu(num-1) + fiboRecu(num-2);

        }

    }

    public static int factorial(int num) {

        if (num <= 1) {

            return num;

        } else {

            return num * factorial(num-1);

        }

    }

    public static int reves(int numero) {

        boolean esNegativo = numero < 0;
        int numPositivo = Math.abs(numero);
        int numeroInvertido = 0;

        while (numPositivo > 0) {

            int digito = numPositivo % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numPositivo = numPositivo / 10;

        }

        if (esNegativo) {

            return -numeroInvertido;

        } else {

            return numeroInvertido;

        }

    }

}

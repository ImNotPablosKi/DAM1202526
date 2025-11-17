package TEMA4.Ejercicios1;

public class ej12 {

    public static int fibonacci(int num) {

        if (num == 0) {

            return 0;

        } else if (num == 1) {

            return 1;

        } else {

            return (fibonacci(num-1) + fibonacci(num-2));

        }

    }

    public static void main(String[] args) {

        int num = 9;
        System.out.println("La posición " + num + " de fibopollas es: " + fibonacci(num));

    }
}

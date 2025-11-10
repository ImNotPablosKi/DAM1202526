package TEMA3.Pruebas;

public class random {
    public static void main(String[] args) {

        int max = 100;
        int min = 50;

        for (int i = 0; i < 100 ; i++) {

            // Math.random() * (Máximo numero permitido) + minimo;
            int num = (int) (Math.random() * (100) + 1);
            System.out.println(num);

            // La buena, en este caso entre 50 y 100, el numero minimo a menos que sea 1 DEBE ser una variable.
            // Si no se enfada, y bastante.
            int random = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(random);

        }

    }
}

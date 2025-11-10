package TEMA3.Pruebas;

public class random {
    public static void main(String[] args) {

        int max = 100;
        int min = 50;

        for (int i = 0; i < 100 ; i++) {

            // Math.random() * (Máximo numero permitido) + minimo;
            int num = (int) (Math.random() * (100) + 1);
            System.out.println(num);

            // La buena
            int random = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(random);

        }

    }
}

package TEMA3.ejercicios2Control;

public class ej5 {
    public static void main(String[] args) {
        int i = 26;
        while (i > 9) {
            if (i % 2 == 0) {
                System.out.println(i);
                i = i - 2;
            }
        }
    }
}

package EJ1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {

        // Creación del randomizador y almacén
        Random rando = new Random();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            // Generar num. aleatorio y meterlo a la lista
            int num = rando.nextInt(0, 49);
            nums.add(num);

        }

        // Comprobar
        System.out.println(nums);

        // Mapa para poder contar cómodamente
        LinkedHashMap<Integer, Integer> numeros = new LinkedHashMap<>();

        for (int i = 0; i < nums.size(); i++) {

            // Asignacion de clave y valor a cada numero, si ya aparece le sumo 1
            numeros.put(nums.get(i), numeros.containsKey(nums.get(i)) ? numeros.get(nums.get(i)) + 1 : 1);

        }

        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {

            // Si no se repite, que printee
            if (entry.getValue() == 1) {

                System.out.println(entry.getKey());
                break;

            }

        }

    }
}

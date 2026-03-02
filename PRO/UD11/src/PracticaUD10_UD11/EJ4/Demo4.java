package EJ4;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/Dump/Metadata_in_DBMS.txt"))) {

            String line;

            HashMap<String, Integer> palabras = new HashMap<>();

            while ((line = br.readLine()) != null) {

                for (String s: line.toLowerCase().split("\\W+")) {

                    if(!s.isEmpty()) {

                        palabras.put(s, palabras.containsKey(s) ? palabras.get(s) + 1 : 1);

                    }

                }

            }

            System.out.println(palabras);


            List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(palabras.entrySet());
            listaPalabras.sort((a, b) -> b.getValue() - a.getValue());

            // Mostrar las tres palabras más frecuentes
            System.out.println("Las tres palabras más frecuentes son:");
            for (int i = 0; i < 3 && i < listaPalabras.size(); i++) {
                System.out.println(listaPalabras.get(i).getKey() + ": " + listaPalabras.get(i).getValue());
            }

        } catch (FileNotFoundException e) {

            System.out.println("El archivo solicitado no existe");

        } catch (IOException e) {

            System.out.println("Error de E/S");

        }

    }
}

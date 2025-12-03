package TEMA5.Ejercicios1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bien = false;
        String prov;
        ArrayList<String> pueblos = new ArrayList<>();

        do {

            System.out.println("""
                    ====== HOLA CARRACOLA =====
                    ././././././././././././././
                    
                    Elige Bro:
                    
                    1. Mostrar pueblos por provincia.
                    2. Introducir Pueblos.
                    3. Mostrar todo en Orden.
                    4. Buscar Pueblo
                    0. SALIR
                    """);

            System.out.print("> ");

            try {

                int opc = Integer.parseInt(sc.nextLine());

                switch (opc) {

                    case 1:

                        System.out.println("Qué pro(b)incia quieres desglosar?");
                        prov = sc.next();

                        if (prov.equalsIgnoreCase("Teruel")) {

                            pueblos.clear();

                            pueblos.add("Albarracin");
                            pueblos.add("Cella");
                            pueblos.add("Olba");

                            pueblos.sort(null);

                            for (String pueblo : pueblos) {

                                System.out.print(pueblo + " ");

                            }

                        } else if (prov.equalsIgnoreCase("Zaragoza")) {

                            pueblos.clear();

                            pueblos.add("Zaragocete");
                            pueblos.add("Pueblo Genérico");
                            pueblos.add("Puteros");

                            pueblos.sort(null);

                            for (String pueblo : pueblos) {

                                System.out.print(pueblo + " ");

                            }

                        } else if (prov.equalsIgnoreCase("Huesca")) {

                            pueblos.clear();

                            pueblos.add("Montañoso");
                            pueblos.add("Picos");
                            pueblos.add("Palass");

                            pueblos.sort(null);

                            for (String pueblo : pueblos) {

                                System.out.print(pueblo + " ");

                            }

                        }

                        bien = true;

                        break;
                    case 2:

                        System.out.println("Que provincia vas a elegir?");
                        prov = sc.next();

                        if (prov.equalsIgnoreCase("Teruel")) {

                            System.out.println("Cuántos pueblos vas a meter?");

                            try {

                                int numPueblos = Integer.parseInt(sc.nextLine());
                                String[] pueblosTer = new String[numPueblos];



                            } catch (NumberFormatException e) {

                                System.out.println("NO");

                            }

                        }

                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 0:

                        System.out.println("Saliendo...");
                        bien = true;

                        break;
                    default:

                        System.out.println("Buenísima");

                        break;
                }

            } catch (NumberFormatException e) {

                System.out.println("Muy Buena");

            }

        } while (!bien);

        // No voy a continuarlo, hay cosas más jodidas que hacer.

    }
}

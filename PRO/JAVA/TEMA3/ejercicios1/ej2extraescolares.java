package TEMA3.ejercicios1;
import java.util.*;

public class ej2extraescolares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean duh = false;

        do {
            int opc;
            String cosa;
            System.out.println("Seleccione el día de la semana (1 - 7): ");
            if (sc.hasNextInt()) {
                opc = sc.nextInt();
                sc.nextLine();
                switch (opc) {
                    case 1:
                        System.out.println("Lunes: Música");
                        System.out.println("Desea volver a Inicio?: (S/N)");
                        cosa = sc.next();

                        if (cosa.equalsIgnoreCase("S")) {
                            duh = false;
                        } else if (cosa.equalsIgnoreCase("N")) {
                            System.out.println("Saliendo...");
                            duh = true;
                        } else {
                            System.out.println("Opción no válida (reading banned)");
                            duh = false;
                        }
                        break;
                    case 2:
                        System.out.println("Martes: Natación");
                        System.out.println("Desea volver a Inicio?: (S/N)");
                        cosa = sc.next();

                        if (cosa.equalsIgnoreCase("S")) {
                            duh = false;
                        } else if (cosa.equalsIgnoreCase("N")) {
                            System.out.println("Saliendo...");
                            duh = true;
                        } else {
                            System.out.println("Opción no válida (reading banned)");
                            duh = false;
                        }
                        break;
                    case 3:
                        System.out.println("Miércoles: Inglés");
                        System.out.println("Desea volver a Inicio?: (S/N)");
                        cosa = sc.next();

                        if (cosa.equalsIgnoreCase("S")) {
                            duh = false;
                        } else if (cosa.equalsIgnoreCase("N")) {
                            System.out.println("Saliendo...");
                            duh = true;
                        } else {
                            System.out.println("Opción no válida (reading banned)");
                            duh = false;
                        }
                        break;
                    case 4:
                        System.out.println("Jueves: Natación");
                        System.out.println("Desea volver a Inicio?: (S/N)");
                        cosa = sc.next();

                        if (cosa.equalsIgnoreCase("S")) {
                            duh = false;
                        } else if (cosa.equalsIgnoreCase("N")) {
                            System.out.println("Saliendo...");
                            duh = true;
                        } else {
                            System.out.println("Opción no válida (reading banned)");
                            duh = false;
                        }
                        break;
                    case 5:
                        System.out.println("Viernes: [No hay actividades registradas]");
                        System.out.println("Desea volver a Inicio?: (S/N)");
                        cosa = sc.next();

                        if (cosa.equalsIgnoreCase("S")) {
                            duh = false;
                        } else if (cosa.equalsIgnoreCase("N")) {
                            System.out.println("Saliendo...");
                            duh = true;
                        } else {
                            System.out.println("Opción no válida (reading banned)");
                            duh = false;
                        }
                        break;
                    case 6:
                        System.out.println("Sábado: Deportes escolares");
                        System.out.println("Desea volver a Inicio?: (S/N)");
                        cosa = sc.next();

                        if (cosa.equalsIgnoreCase("S")) {
                            duh = false;
                        } else if (cosa.equalsIgnoreCase("N")) {
                            System.out.println("Saliendo...");
                            duh = true;
                        } else {
                            System.out.println("Opción no válida (reading banned)");
                            duh = false;
                        }
                        break;
                    case 7:
                        System.out.println("Domingo: [No hay actividades registradas]");
                        System.out.println("Desea volver a Inicio?: (S/N)");
                        cosa = sc.next();

                        if (cosa.equalsIgnoreCase("S")) {
                            duh = false;
                        } else if (cosa.equalsIgnoreCase("N")) {
                            System.out.println("Saliendo...");
                            duh = true;
                        } else {
                            System.out.println("Opción no válida (reading banned)");
                            duh = false;
                        }
                        break;
                }
            } else {
                System.out.println("INCORRECTO AAAAAAAARGHJH");
                sc.nextLine();
                duh = false;
            }
        } while (!duh);

    }
}

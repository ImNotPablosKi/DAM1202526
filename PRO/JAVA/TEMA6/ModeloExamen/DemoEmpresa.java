package TEMA6.ModeloExamen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoEmpresa {

    public static void main(String[] args) {

        // Its Over.

        Scanner sc = new Scanner(System.in);
        boolean bien = false;

        Empleados e1 = new Empleados("Pablo", "Gorras", LocalDate.parse("2025-08-25"), "12432434H", 1200.0, "PC1");
        Empleados e2 = new Empleados("Hecprooll", "Criado", LocalDate.parse("2025-09-30"), "76859478J", 1267.0, "PC2");
        Empleados e3 = new Empleados("Pascual", "Pérez", LocalDate.parse("2023-09-08"), "66666666K", 9999.0, "el jefe");
        Empleados e4 = new Empleados("Andres", "Pescaru?", LocalDate.parse("2025-12-07"), "17680434H", 1500.0, "PC3");
        Empleados e5 = new Empleados("Alonso", "SorianoGPT", LocalDate.parse("2025-10-11"), "77463534R", 2000.0, "PC4");

        ArrayList<Empleados> empleados = new ArrayList<>();

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);

        Empresa misEmpleados = new Empresa(empleados);
        misEmpleados.mostrarEmpleados();

        System.out.println();
        System.out.println("El salario promedio es: " + misEmpleados.salarioPromedio());

        misEmpleados.mayorAntiguedad();
        System.out.println();

        do {

            System.out.print("| Vas a buscar por puesto (1) o nombre (2)?\n> ");

            try {

                int opc = Integer.parseInt(sc.nextLine());

                switch (opc) {

                    case 1:

                        System.out.print("| Dame un puesto\n> ");

                        String puesto = sc.next();

                        System.out.println(misEmpleados.buscarEmpleado(puesto));

                        bien = true;

                        break;
                    case 2:

                        System.out.print("| Dame un nombre\n> ");

                        String nombre = sc.next();

                        misEmpleados.buscarEmpleado(nombre);

                        bien = true;

                        break;
                    default:
                        System.out.println("-> NO <- sabes leer.");
                        break;
                }

            } catch (NumberFormatException e) {

                System.out.println("no.");

            }


        } while (!bien);



    }
}

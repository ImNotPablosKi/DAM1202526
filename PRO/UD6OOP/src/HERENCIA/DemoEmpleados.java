package HERENCIA;

import java.util.ArrayList;

public class DemoEmpleados {
    public static void main(String[] args) {

        ArrayList<Empleado>empleados = new ArrayList<>();

        Empleado e1 = new Empleado("Pascual", 1200.0);
        Empleado e2 = new Empleado("Juanma", 9999.0);

        EmpleadoPorHoras mario = new EmpleadoPorHoras("Mario", 8, 15);

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(mario);

        for (Empleado e: empleados) {

            System.out.println(e.calcularSalario());

        }

    }

}

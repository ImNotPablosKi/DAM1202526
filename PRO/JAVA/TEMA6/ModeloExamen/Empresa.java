package TEMA6.ModeloExamen;


import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleados> empleados;

    public ArrayList<Empleados> getEmpleados() {

        return empleados;

    }

    public Empresa(ArrayList<Empleados> empleados) {

        this.empleados = empleados;

    }

    public void mostrarEmpleados() {

        for (Empleados empleado: empleados) {

            System.out.print(empleado.getNombre() + ", ");

        }

    }

    Double salarioPromedio() {

        Double total = 0.0;

        for (Empleados empleado : empleados) {

            total += empleado.getSalario();

        }

        return total;

    }

    public void mayorAntiguedad() {

        Integer masAntiguo = 0;

        for (Empleados empleado : empleados) {

            if (empleado.antiguedad() > masAntiguo) {

                masAntiguo = empleado.antiguedad();

            }

        }

        System.out.println("El más antiguo tiene una antiguedad de: " + masAntiguo.toString() + " años.");;

    }

    public void buscarEmpleado(String target ) {

        boolean found = false;

        Empleados aux = new Empleados();

        for (Empleados empleado : empleados) {

            if (empleado.getNombre().equalsIgnoreCase(target) || empleado.getPuesto().equalsIgnoreCase(target)) {

                found = true;
                aux = empleado;

            }

        }

        if (found) {

            System.out.println("Objetivo Encontrado!");
            System.out.println(aux.toString());

        } else {

            System.out.println("No se ha encontrado al objetivo especificado.");

        }

    }

}

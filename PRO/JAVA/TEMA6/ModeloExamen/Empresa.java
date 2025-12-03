package TEMA6.ModeloExamen;


import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleados> empleados;

    public ArrayList<Empleados> getEmpleados() {

        return empleados;

    }

    //uh, pero vale uh
    public Empresa() {

        empleados = new ArrayList<>();

    }

    public Empresa(ArrayList<Empleados> empleados) {

        this.empleados = empleados;

    }

    public void mostrarEmpleados() {

        if (empleados.isEmpty()) {

            System.out.println("No hay empleados a mostrar.");

        } else {

            for (Empleados empleado: empleados) {

                System.out.print(empleado.getNombre() + ", ");

            }

        }

    }

    Double salarioPromedio() {

        Double total = 0.0;

        if (empleados.isEmpty()) {

            System.out.println("No hay empleados a mostrar.");
            return 0.0;

        } else {

            for (Empleados empleado : empleados) {

                total += empleado.getSalario();

            }

            return total/empleados.size();

        }

    }

    public Empleados mayorAntiguedad() {

        if (empleados.isEmpty()) return null;

        Empleados masAntiguo = empleados.get(0); // Cojo primer elemento del ArrayList

        for (Empleados empleado : empleados) {

            if (empleado.antiguedad() > masAntiguo.antiguedad()) {

                masAntiguo = empleado;

            }

        }

       return masAntiguo;

    }

    // Tengo retraso
    public void buscarEmpleadoPeroMal(String target ) {

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

    // Esto está mejor, se me debería haber ocurrido pero uh
    public ArrayList<Empleados> buscarEmpleado(String target) {

        ArrayList<Empleados> found = new ArrayList<>();

        for (Empleados empleado : empleados) {

            if (empleado.getNombre().equalsIgnoreCase(target) || empleado.getPuesto().equalsIgnoreCase(target)) {

                found.add(empleado);

            }

        }

        return found;

    }

}

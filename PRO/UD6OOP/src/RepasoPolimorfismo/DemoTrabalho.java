package RepasoPolimorfismo;

import java.util.ArrayList;

public class DemoTrabalho {
    public static void main(String[] args) {

        ArrayList<Persona> misPersonas = new ArrayList<>();

        misPersonas.add(new Persona("Dani", "Remón Juan", false));
        misPersonas.add(new Empleado("Juanma", "Moreno", false, 1200));
        misPersonas.add(new EmpleadoCualificado("Pascual", "Pérez Bagán", false, 3000, 67, true, "El Taller"));

        for (Persona p: misPersonas) {

            System.out.println(p.registroCivil());

            if (p instanceof Empleado) {

                if (p.getNombre().equalsIgnoreCase("Juanma")) {

                    System.out.println(((Empleado) p).mePaganMal());

                }

            }

            if (p instanceof EmpleadoCualificado) {

                System.out.println(((EmpleadoCualificado) p).mePaganBien());
                System.out.println(((EmpleadoCualificado) p).soyEmpleadoDelMes());

            }



        }

    }
}

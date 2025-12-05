package EJ1_REPASO;

import java.util.ArrayList;

public class Personas {

    private ArrayList<Persona> personas;

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public Personas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void mostrarPersonas() {

        if (personas.isEmpty()) {

            System.out.println("No hay Personas");

        } else {

            for (Persona p: personas) {

                System.out.println(p);

            }

        }

    }

    public Integer edadMedia() {

        Integer total = 0;

        if (personas.isEmpty()) return 0;

        for (Persona p: personas) {

            total += p.calcularEdad();

        }

        return total / personas.size();

    }

    public Persona masAntiguo() {

        if (personas.isEmpty()) return null;

        Persona masAntiguo = personas.get(0);

        for (Persona p: personas) {

            if (p.calcularEdad() > masAntiguo.calcularEdad()) {

                masAntiguo = p;

            }

        }

        return masAntiguo;

    }

}

package EJ1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personas {

    private ArrayList<Persona> personas;

    public Personas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void mostrarPersonas() {

        for (Persona persona : personas) {

            System.out.println(persona.toString());

        }

    }

    public Integer edadMedia() {

        Integer total = 0;

        for (Persona persona : personas) {

            total += persona.calcularEdad();

        }

        return total / personas.size();

    }

    public Persona mayorEdad() {

        Persona mayor = new Persona("Mayor", LocalDate.now());

        for (Persona persona : personas) {

            if (persona.calcularEdad() > mayor.calcularEdad()) {

                mayor = persona;

            }

        }

        return mayor;

    }


}

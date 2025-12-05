package EJ1_REPASO;

import java.time.LocalDate;
import java.util.ArrayList;

public class DemoPersonas {
    public static void main(String[] args) {

        Persona p1 = new Persona("Hecprooll", "GPT", LocalDate.parse("2007-06-09"), "34782789A", 'M');
        Persona p2 = new Persona("Alonso", "SorianoGPT", LocalDate.parse("2021-10-02"), "463782647K", 'M');
        Persona p3 = new Persona("Iker", "Botzano", LocalDate.parse("2007-03-21"), "987367557J", 'M');

        ArrayList<Persona> misPersonas = new ArrayList<>();

        misPersonas.add(p1);
        misPersonas.add(p2);
        misPersonas.add(p3);

        Personas gente = new Personas(misPersonas);

        gente.mostrarPersonas();

        System.out.println("La edad media de esta gente es de: " + gente.edadMedia() + " años.");

        System.out.println("La persona más mayor es " + gente.masAntiguo().getNombre() + " con una edad de " + gente.masAntiguo().calcularEdad() + " años.");


    }

}

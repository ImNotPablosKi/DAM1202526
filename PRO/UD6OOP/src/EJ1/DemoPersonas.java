package EJ1;

import java.time.LocalDate;
import java.util.ArrayList;

public class DemoPersonas {
    public static void main(String[] args) {

        Persona p1 = new Persona("Pablo", "Miguel", LocalDate.parse("2007-08-25"), "56476879H", 'M');
        Persona p2 = new Persona("Hecprooll", "GPT", LocalDate.parse("2021-06-17"), "879766574J", 'M');
        Persona p3 = new Persona("Alonso", "Sor2425$", LocalDate.parse("2007-11-08"), "90263567K", 'M');

        ArrayList<Persona> Personas = new ArrayList<>();

        Personas.add(p1);
        Personas.add(p2);
        Personas.add(p3);

        EJ1.Personas misPersonas = new Personas(Personas);
        misPersonas.mostrarPersonas();

        System.out.println();

        System.out.println("La edad media de mis Personas es de: " + misPersonas.edadMedia() + " años.");

        System.out.println("La persona con mayor edad es: " + misPersonas.mayorEdad());

    }
}

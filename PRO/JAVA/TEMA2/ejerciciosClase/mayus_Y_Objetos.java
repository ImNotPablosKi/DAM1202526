package TEMA2.ejerciciosClase;

public class mayus_Y_Objetos {

    public static void main(String[] args) {
        String hola = "Hola,";
        String adios = "Adiós,";
        String mundo = new String("mundo!");
        String mensaje = new String(hola.toUpperCase() + mundo.toUpperCase());

        // Mostramos por pantalla estos textos en mayúsculas
        System.out.println(mensaje);
        System.out.println(adios.toUpperCase() + mundo.toUpperCase());

        //Ejemplos de instanciación
        String ejemplo = "Ejemplo";
        String ejemplo1 = "Ejemplo";
        String ejemplo2 = new String("Ejemplo");
        String ejemplo3 = new String(ejemplo);
        String ejemploDoble = ejemplo + " doble";

        //¿Cuando son dos objetos iguales?
        System.out.println("Operador ==");
        System.out.println("\"" + ejemplo + "\" es igual a \"" + ejemplo1 + "\" :" + (ejemplo == ejemplo1));

        System.out.println("\"" + ejemplo + "\" es igual a \"" + ejemplo2 + "\" :" + (ejemplo == ejemplo2));

        System.out.println("\"" + ejemplo + "\" es igual a \"" + ejemplo3 + "\" :" + (ejemplo == ejemplo3));

        //Utilización del método equals
        System.out.println("Método equals de la clase String");
        System.out.println("\"" + ejemplo + "\" es igual a \"" + ejemplo1 + "\" :" + (ejemplo.equals(ejemplo1)));

        System.out.println("\"" + ejemplo + "\" es igual a \"" + ejemplo2 + "\" :" + (ejemplo.equals(ejemplo2)));

        System.out.println("\"" + ejemplo + "\" es igual a \"" + ejemplo3 + "\" :" + (ejemplo.equals(ejemplo3)));
    }
}

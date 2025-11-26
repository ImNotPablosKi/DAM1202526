package TEMA6.Pruebas;

public class demoPersonas {
    public static void main(String[] args) {
        Personas p1 = new Personas();
        Personas p2 = new Personas("Alonso", 80.0, 170.25, 18, "184456123J");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        p2.setAltura(190.25);
        p2.setEdad(89);
        p2.setNombre("Alfonso");

        System.out.println(p2.toString());

    }
}

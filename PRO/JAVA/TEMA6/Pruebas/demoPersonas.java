package TEMA6.Pruebas;

public class demoPersonas {
    public static void main(String[] args) {
        Personas p1 = new Personas();
        Personas p2 = new Personas("Alonso", 80.0, 170.25, 18, "184456123J");

        System.out.println(p1);
        System.out.println(p2);

        p2.setAltura(190.25);
        p2.setEdad(89);
        p2.setNombre("Alfonso");

        System.out.println(p2);

        Estudiante e1 = new Estudiante("Hector", 70.0, 170.0, 18, "12567455K", 123, 2, 8);
        Estudiante e2 = new Estudiante("Borja", 62.0, 180.0, 18, "12569999L", 456, 0, 6);

        Profesor pro1 = new Profesor("Juanma breva", 68.0, 180.0, 42, "3642756378K", 1000.0, true);
        Profesor pro2 = new Profesor("Ángel", 98.0, 180.0, 36, "874563553P", 0.0, false);

        pro2.setEsCabron(true);
        System.out.println(pro1);
        System.out.println(pro2);

    }
}

package HERENCIA;

import java.util.ArrayList;

public class DemoVehiculos {

    public static void main(String[] args) {

        ArrayList<Vehiculo> misVehiculos = new ArrayList<>();

        Coche c1 = new Coche("Mercedes", "SLG McLaren");
        Motocicleta m1 = new Motocicleta("KTM", "KT-2");

        misVehiculos.add(c1);
        misVehiculos.add(m1);

        for (Vehiculo v: misVehiculos) {

            v.arrancar();

        }

        c1.abrirMaletero();
        m1.hacerCaballito();

    }

}

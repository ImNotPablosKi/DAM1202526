package HERENCIA;

import java.util.ArrayList;

public class DemoVehiculos {

    public static void main(String[] args) {

        ArrayList<Vehiculo> misVehiculos = new ArrayList<>();

        misVehiculos.add(new Coche("Mercedes", "SLG McLaren"));
        misVehiculos.add(new Motocicleta("KTM", "KT-2"));
        misVehiculos.add(new Coche("Mercedes BENZ", "AMG GT3"));

        for (Vehiculo v: misVehiculos) {

            v.arrancar();

            if (v instanceof Coche) {

                ((Coche) v).abrirMaletero();

            } else if (v instanceof Motocicleta) {

                ((Motocicleta) v).hacerCaballito();

            }

        }
    }

}

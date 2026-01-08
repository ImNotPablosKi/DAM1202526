package HERENCIA;

public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {

        System.out.println("Arrancando...");

    }

}

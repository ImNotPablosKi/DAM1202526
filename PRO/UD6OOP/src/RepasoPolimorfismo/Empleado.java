package RepasoPolimorfismo;

public class Empleado extends Persona {

    private double salario;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, String apellidos, boolean fallecido, double salario) {
        super(nombre, apellidos, fallecido);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String mePaganMal() {

        return "Hola soy " + getNombre() + ", Me cago en la puta mi salario da pena";

    }

    public String mePaganBien() {

        return "Aquí " + getNombre() + ", Soy funcionario y daría mi vida por el PSOE";

    }

}

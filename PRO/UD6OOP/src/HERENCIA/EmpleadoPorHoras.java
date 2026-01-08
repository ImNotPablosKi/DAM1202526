package HERENCIA;

public class EmpleadoPorHoras extends Empleado{

    private Integer horas;
    private Integer tarifaHora;


    public EmpleadoPorHoras(Integer horas, Integer tarifaHora) {
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    public EmpleadoPorHoras(String nombre, Integer horas, Integer tarifaHora) {
        super(nombre);
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public Double calcularSalario() {
        return (double) horas*tarifaHora;
    }
}

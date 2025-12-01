package TEMA6.ModeloExamen;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Empleados {

    private String nombre;
    private String apellidos;
    private LocalDate fechaContratacion;
    private String dni;
    private Double salario;
    private String puesto;

    public Empleados() {
    }

    public Empleados(String nombre) {
        this.nombre = nombre;
    }

    public Empleados(String nombre, String apellidos, LocalDate fechaContratacion, String dni, Double salario, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaContratacion = fechaContratacion;
        this.dni = dni;
        this.salario = salario;
        this.puesto = puesto;
    }

    public Empleados(String nombre, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    String trabajar() {

        return "Estoy trabajando como: " + puesto;

    }

    @Override
    public String toString() {
        return "Empleado/a: " + apellidos + ", " + nombre + ", fué contratad@ el " + fechaContratacion + " con dni " + dni + "\n" +
                " y salario de " + salario + ". Su actual puesto es: " + puesto;
    }

    Integer antiguedad() {

        return Period.between(fechaContratacion, LocalDate.now()).getYears();

    }
}

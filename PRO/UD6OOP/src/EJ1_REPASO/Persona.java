package EJ1_REPASO;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {

    public Persona() {
    }

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String dni;
    private char sexo;
    private static Integer contador = 1;
    private int id;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String dni, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        id=contador++;
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    String saludar() {

        return "Hola, soy " + nombre;

    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + nombre + " " + apellidos + " con DNI " + dni + ", nacid@ el " + fechaNacimiento + ". Sexo: " + sexo;
    }

    public Integer calcularEdad() {

        // return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();

    }

}

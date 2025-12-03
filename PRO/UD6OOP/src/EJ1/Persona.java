package EJ1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private String dni;
    private char sexo;

    public Persona() {
    }

    public String saludar(Persona persona) {

        return "Hola, soy: " + persona.getNombre();

    }

    @Override
    public String toString() {

        return "Persona: " + apellidos + " " + nombre + ", con DNI " + dni + " y sexo " + sexo + ". Su fecha de nacimiento es: " + fechaNac;

    }

    Integer calcularEdad() {

        return Period.between(fechaNac, LocalDate.now()).getYears();

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Persona(String nombre, String apellidos, LocalDate fechaNac, String dni, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.sexo = sexo;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
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

}

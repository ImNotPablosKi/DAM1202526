package EJ1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {

    private Integer curso;
    private char grupo;
    private ArrayList<String> asignaturas;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, LocalDate fechaNac, String dni, char sexo, Integer curso, char grupo, ArrayList<String> asignaturas) {
        super(nombre, apellidos, fechaNac, dni, sexo);
        this.curso = curso;
        this.grupo = grupo;
        this.asignaturas = asignaturas;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public ArrayList<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso=" + curso +
                ", grupo=" + grupo +
                ", asignaturas=" + asignaturas +
                '}';
    }
}

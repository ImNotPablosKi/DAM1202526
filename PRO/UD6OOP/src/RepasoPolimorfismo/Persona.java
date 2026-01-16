package RepasoPolimorfismo;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private boolean fallecido;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, boolean fallecido) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fallecido = fallecido;
    }

    public  String registroCivil() {

        return nombre + " " + apellidos + ". Se encuentra fallecido? -> " + fallecido;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public boolean isFallecido() {
        return fallecido;
    }

    public void setFallecido(boolean fallecido) {
        this.fallecido = fallecido;
    }
}

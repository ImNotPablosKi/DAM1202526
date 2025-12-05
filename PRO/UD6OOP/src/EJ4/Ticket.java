package EJ4;

public class Ticket {

    private String nombre;
    private Integer unidades;
    private Double precio;
    private Double iva;
    private static int contador = 1;
    private int id;

    public Ticket() {
    }

    public Ticket(String nombre, Integer unidades, Double precio, Double iva) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
        this.iva = iva;
        id=contador++;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "nombre='" + nombre + '\'' +
                ", unidades=" + unidades +
                ", precio=" + precio +
                ", iva=" + iva +
                ", id=" + id +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double valorLineaTicket() {

        return unidades * precio;

    }
}

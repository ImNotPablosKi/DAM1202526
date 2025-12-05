package PescaruObjetos;

public class Producto {

    private String nombre;
    private Double precio;
    private Double iva;
    private Integer cantidad;
    private static int contador = 1;
    private int id;


    public Producto() {
    }

    public Producto(String nombre, Double precio, Double iva, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cantidad = cantidad;
        id=contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", " + cantidad + " unidades a " + precio + "€, a un IVA de " + iva + " con ID: " + id;
    }

    public Double calcularPrecio() {

        return cantidad * precio;

    }

    public void mostrarLinea() {

        System.out.println("Nombre: " + nombre + ", " + cantidad + " unidades a " + calcularPrecio() + "€, a un IVA de " + iva + " con ID: " + id);

    }

}

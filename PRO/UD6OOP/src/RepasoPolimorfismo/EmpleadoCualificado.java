package RepasoPolimorfismo;

public class EmpleadoCualificado extends Empleado {

    private double bonus;
    private boolean esEmpleadoDelMes;
    private String departanmento;

    public EmpleadoCualificado() {
        super();
    }

    public EmpleadoCualificado(double bonus, boolean esEmpleadoDelMes, String departanmento) {
        this.bonus = bonus;
        this.esEmpleadoDelMes = esEmpleadoDelMes;
        this.departanmento = departanmento;
    }

    public EmpleadoCualificado(String nombre, String apellidos, boolean fallecido, double salario, double bonus, boolean esEmpleadoDelMes, String departanmento) {
        super(nombre, apellidos, fallecido, salario);
        this.bonus = bonus;
        this.esEmpleadoDelMes = esEmpleadoDelMes;
        this.departanmento = departanmento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isEsEmpleadoDelMes() {
        return esEmpleadoDelMes;
    }

    public void setEsEmpleadoDelMes(boolean esEmpleadoDelMes) {
        this.esEmpleadoDelMes = esEmpleadoDelMes;
    }

    public String getDepartanmento() {
        return departanmento;
    }

    public void setDepartanmento(String departanmento) {
        this.departanmento = departanmento;
    }

    public String soyEmpleadoDelMes() {

        return "Yo, " + getNombre() + ", Soy empleado del mes? -> " + esEmpleadoDelMes;

    }

    @Override
    public String mePaganBien() {
        return "SOY FUNCIONARIO JODER CLARO QUE ME PAGAN BIEN";
    }
}

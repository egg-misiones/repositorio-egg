package EjemploEmpleado;

// La clase EmpleadoPorHoras hereda de Empleado
public class EmpleadoPorHoras extends Empleado {

    private double sueldo; // Sueldo por hora
    private double horas; // Horas trabajadas por semana

    public EmpleadoPorHoras(String nombre, String apellido, String numeroSeguroSocial, double sueldo, double horas) {
        super(nombre, apellido, numeroSeguroSocial);
        this.sueldo = (sueldo < 0.0) ? 0.0 : sueldo;
        this.horas = ((horas < 0.0) && (horas > 168)) ? 0.0 : horas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = (sueldo < 0.0) ? 0.0 : sueldo;
    }

    public void setHoras(double horas) {
        this.horas = ((horas < 0.0) && (horas > 168)) ? 0.0 : horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getHoras() {
        return horas;
    }

    @Override
    public double ingresos() {
        if (getHoras() <= 40) {
            return getSueldo() * getHoras();
        } else {
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }

    @Override
    public String toString() {
        return "EMPLEADO POR HORAS" + "\n"
                + super.toString() + "\n"
                + "Sueldo por hora: " + getSueldo() + "\n"
                + "Horas trabajadas: " + getHoras() + "\n";
    }
}

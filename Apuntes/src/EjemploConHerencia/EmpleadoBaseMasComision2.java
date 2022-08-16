package EjemploConHerencia;

import EjemploSinHerencia1er.EmpleadoPorComision;

public class EmpleadoBaseMasComision2 extends EmpleadoPorComision {

    private double salarioBase; // Salario base por semana

    // Constructor con 6 argumentos
    public EmpleadoBaseMasComision2(String nombre, String apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        // Llamada explícita al constructor de la superclase EmpleadoPorComision
        super(nombre, apellido, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    // Validación del parámetro salarioBase
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    /* Método para calcular el salario del empleado:
    Este método escrito así arroja un error debido a que los atributos
    tarifaComision y ventasBrutas de la superclase EmpleadoPorComision
    son privados.
    public double obtenerIngresos() {
        return salarioBase + (tarifaComision * ventasBrutas);
    }
    
    * Se sobrescribe el método toString
    Este método también arroja error por la misma razón explicada anteriormente.
    @Override
    public String toString() {
        return "Empleado por comisión con sueldo base: " + nombre + " " + apellido + "\n"
                + "Nº de seguro social: " + numeroSeguroSocial + "\n"
                + "Ventas brutas: " + ventasBrutas + "\n"
                + "Tarifa por comisión: " + tarifaComision + "\n"
                + "Salario base: " + salarioBase;
    }
     */
    // Método para calcular el salario del empleado usando los métodos getters
    @Override
    public double obtenerIngresos() {
        return salarioBase + (getTarifaComision() * getVentasBrutas());
    }

    // Se sobrescribe el método toString usando los métodos getters
    @Override
    public String toString() {
        return "Empleado por comisión con sueldo base: " + getNombre() + " " + getApellido() + "\n"
                + "Nº de seguro social: " + getNumeroSeguroSocial() + "\n"
                + "Ventas brutas: " + getVentasBrutas() + "\n"
                + "Tarifa por comisión: " + getTarifaComision() + "\n"
                + "Salario base: " + salarioBase;
    }
}

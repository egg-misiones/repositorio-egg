package Ejercicio04;

public class Principal {

    public static void main(String[] args) {
        AlumnoService alumnoService = new AlumnoService();

        alumnoService.crearAlumno("Ricardo", "Bello", 11111, 'M', "Regular", 85);
        alumnoService.crearAlumno("Paula", "Flores", 22222, 'F', "Regular", 75);
        alumnoService.crearAlumno("Pablo", "Pérez", 33333, 'M', "Condicional", 55);
        alumnoService.crearAlumno("Matías", "Herrera", 44444, 'M', "Regular", 80);
        alumnoService.crearAlumno("Leandro", "Ramos", 55555, 'M', "Condicional", 45);
        alumnoService.crearAlumno("Lorena", "Bernal", 66666, 'F', "Regular", 95);
        alumnoService.crearAlumno("Andrea", "Vega", 77777, 'F', "Regular", 80);
        alumnoService.crearAlumno("Marcos", "Perea", 88888, 'M', "Condicional", 35);
        alumnoService.mostrarListaAlumno();
        System.out.println();
        alumnoService.mostrarListaCondicional();
        System.out.println();
        alumnoService.ordenarMayorMenor();
        System.out.println();
        alumnoService.ordenarMenorMayor();
        System.out.println();
        alumnoService.ordenarNombreApellido();
    }
}

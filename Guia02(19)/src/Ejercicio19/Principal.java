package Ejercicio19;

public class Principal {

    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        Persona persona1;
        Persona persona2;

        persona1 = personaService.leer();
        persona2 = personaService.leer();
        personaService.imprimirDatos(persona1);
        personaService.imprimirDatos(persona2);
        personaService.calcularEdad(persona1);
        personaService.calcularEdad(persona2);
        personaService.calcularMenor(persona1, persona2);
    }
}

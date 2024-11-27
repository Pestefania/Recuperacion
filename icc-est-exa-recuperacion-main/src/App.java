import Controllers.PersonaController;
import Models.Persona;

public class App {
    public static void main(String[] args) {
        // Lista de 30 personas
        Persona[] personas = {
            new Persona("Anais", 25),
            new Persona("Luis", 32),
            new Persona("Carlos", 40),
            new Persona("María", 19),
            new Persona("José", 45),
            new Persona("Laura", 30),
            new Persona("Pedro", 28),
            new Persona("Marta", 35),
            new Persona("Jorge", 50),
            new Persona("Sofía", 22),
            new Persona("Raúl", 18),
            new Persona("Patricia", 29),
            new Persona("Andrés", 41),
            new Persona("Elena", 24),
            new Persona("Manuel", 38),
            new Persona("Isabel", 34),
            new Persona("Gabriel", 42),
            new Persona("Claudia", 26),
            new Persona("Fernando", 31),
            new Persona("Paula", 20),
            new Persona("Diego", 36),
            new Persona("Rosa", 27),
            new Persona("Rubén", 44),
            new Persona("Teresa", 33),
            new Persona("Iván", 17),
            new Persona("Julia", 21),
            new Persona("Adriana", 39),
            new Persona("Sergio", 48),
            new Persona("Lorena", 23),
            new Persona("Miguel", 52)
        };

        PersonaController controlador = new PersonaController(personas);

        // Ordenar por edad descendente
        controlador.ordenarPorEdadDescendente();
        System.out.println("Personas ordenadas por edad descendente:");
        for (Persona persona : controlador.getPersonas()) {
            System.out.println(persona);
        }

        // Buscar edades
        int[] edades = {25, 70};
        for (int edad : edades) {
            int pos = controlador.buscarPorEdad(edad);
            if (pos != -1) {
                System.out.println("Persona con edad " + edad + " encontrada: " + 
                                    controlador.getPersonas()[pos].getNombre() + 
                                    " en posición " + pos);
            } else {
                System.out.println("Persona con edad " + edad + " no encontrada.");
            }
        }

        // Ordenar por nombre ascendente
        controlador.ordenarPorNombreAscendente();
        System.out.println("\nPersonas ordenadas por nombre ascendente:");
        for (Persona persona : controlador.getPersonas()) {
            System.out.println(persona);
        }

        // Buscar nombres
        String[] nombres = {"Anais", "Miguel"};
        for (String nombre : nombres) {
            int pos = controlador.buscarPorNombre(nombre);
            if (pos != -1) {
                System.out.println("Persona con nombre " + nombre + " encontrada: " + 
                                    controlador.getPersonas()[pos].getNombre() + 
                                    " en posición " + pos);
            } else {
                System.out.println("Persona con nombre " + nombre + " no encontrada.");
            }
        }
    }
}

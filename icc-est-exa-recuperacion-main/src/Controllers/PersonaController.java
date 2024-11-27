package Controllers;

import Models.Persona;

public class PersonaController {
    private Persona[] personas;

    public PersonaController(Persona[] personas) {
        this.personas = personas;
    }

    // Ordenar por edad descendente usando burbuja
    public void ordenarPorEdadDescendente() {
        boolean huboCambio;
        do {
            huboCambio = false;
            for (int i = 0; i < personas.length - 1; i++) {
                if (personas[i].getEdad() < personas[i + 1].getEdad()) {
                    // Intercambio
                    Persona temp = personas[i];
                    personas[i] = personas[i + 1];
                    personas[i + 1] = temp;
                    huboCambio = true;
                }
            }
        } while (huboCambio);
    }

    // Buscar persona por edad con búsqueda lineal
    public int buscarPorEdad(int edad) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() == edad) {
                return i;
            }
        }
        return -1; // No encontrada
    }

    // Ordenar por nombre ascendente usando selección
    public void ordenarPorNombreAscendente() {
        for (int i = 0; i < personas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].getNombre().compareTo(personas[minIndex].getNombre()) < 0) {
                    minIndex = j;
                }
            }
            // Intercambio
            Persona temp = personas[i];
            personas[i] = personas[minIndex];
            personas[minIndex] = temp;
        }
    }

    // Buscar persona por nombre con búsqueda lineal
    public int buscarPorNombre(String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1; // No encontrada
    }

    public Persona[] getPersonas() {
        return personas;
    }
}

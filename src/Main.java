import modelos.EquipoProgramador;
import modelos.Excepciones;
import modelos.Programador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Excepciones {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        System.out.println("Ingrese la universidad que representa el equipo:");
        String nombreUniversidad = scanner.nextLine();

        System.out.println("Ingrese el lenguaje de programación que va a utilizar el equipo:");
        String lenguajeProgramacion = scanner.nextLine();

        System.out.println("Ingrese el tamaño del equipo:");
        int tamanio = scanner.nextInt();
        scanner.nextLine();

        EquipoProgramador equipo = new EquipoProgramador(nombreEquipo, nombreUniversidad, lenguajeProgramacion, tamanio);

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el nombre del programador " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese los apellidos del programador " + (i + 1) + ":");
            String apellidos = scanner.nextLine();

            try {
                Programador programador = new Programador(nombre, apellidos);
                equipo.anadirProgramador(programador);
            } catch (IllegalArgumentException e) {
                throw new Excepciones(e.getMessage());
            }
        }

        System.out.println(equipo.toString());
        scanner.close();
    }
}
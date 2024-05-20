package modelos;

import servicios.IEquipo;

import java.util.ArrayList;
import java.util.Collection;

public class EquipoProgramador extends Equipo implements IEquipo {
    private Collection<Programador> programadores;

    public EquipoProgramador(String nombreEquipo, String nombreUniversidad, String lenguajeProgramacion, int tamanio){
        super(nombreEquipo, nombreUniversidad, lenguajeProgramacion, tamanio);
        this.programadores = new ArrayList<>();
    }

    @Override
    public boolean isCompleto() {
        return programadores.size() == NUMERO_MAX;
    }

    public void anadirProgramador(Programador programador) throws Excepciones {
        if (programadores.size() >= NUMERO_MAX) {
            throw new Excepciones("El equipo ya está completo.");
        }
        programadores.add(programador);
    }

    public Collection<Programador> getProgramadores(){
        return programadores;
    }

    @Override
    public String toString() {
        return "EquipoProgramador{" +
                "programadores=" + programadores +
                '}';
    }
}

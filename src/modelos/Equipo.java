package modelos;

public abstract class Equipo {
    protected String nombreEquipo;
    protected String nombreUniversidad;
    protected String lenguajeProgramacion;
    protected int tamanio;


    public Equipo(String nombreEquipo, String nombreUniversidad, String lenguajeProgramacion, int tamanio){
        this.nombreEquipo = nombreEquipo;
        this.nombreUniversidad = nombreUniversidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.tamanio = tamanio;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", nombreUniversidad='" + nombreUniversidad + '\'' +
                ", lenguajeProgramacion='" + lenguajeProgramacion + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}

package modelos;

public class Programador{
    protected String nombre;
    protected String apellido;

    public Programador(String nombre, String apellido) throws Excepciones {
        this.nombre = nombre;
        if(!nombre.matches("[a-zA-Z]+")){
            throw new Excepciones("Error en nombre: Solo se puede ingresar texto");
        }else{
            this.nombre = nombre;
        }
        if(!apellido.matches("[a-zA-Z]+")){
            throw new Excepciones("Error en el apellido: Solo se puede ingresar texto");
        }else{
            this.apellido = apellido;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

/**
 * Created by Martincorona007 on 20/04/2017.
 */
public class Persona implements Humano{
    private String nombre;
    private String apellidos;
    private String NIF;


// constructor por defecto
public Persona(){

}
// getters o setters o accedentes o mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }


// interfas que hace que imprime
    @Override
    public String indentificate() {
        return "\nIndentificado: \n\nNombre: "+nombre+" \nApellidos: "+apellidos+" \nNIF:"+NIF;
    }
}

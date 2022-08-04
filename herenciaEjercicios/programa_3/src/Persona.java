/**
 * Created by Martincorona007 on 17/04/2017.
 */
public class Persona{
    public String nombre;
    public String apellidos;
    public String NIF;
//creando metodo(cuenta)
    public Persona(){
        nombre="Ramon";
        apellidos="Guzman";
        NIF="25D9K95L";
    }

    public Persona(String nombre, String apellidos, String NIF) {
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.NIF=NIF;
    }

    //imprimo el cliente
 public String toString(){
        return "\nEl cliente: "+nombre+" "+apellidos+"\nNIF: "+NIF;
 }

}

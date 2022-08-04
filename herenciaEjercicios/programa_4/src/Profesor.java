/**
 * Created by Martincorona007 on 20/04/2017.
 */
public class Profesor extends Persona {
    private String despacho;

    public Profesor(String despacho){
        //super(nombre,apellidos,NIF,direccion);
        this.despacho=despacho;
    }
//metods accedentes y mutadores
    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String toString(){
        return "Ocupacion Profesor\nEl despacho del profe es: "+despacho;
    }
}

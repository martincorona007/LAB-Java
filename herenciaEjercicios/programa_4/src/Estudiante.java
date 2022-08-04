/**
 * Created by Martincorona007 on 20/04/2017.
 */
public class Estudiante extends Persona {
    private int idEstudiante;

    public Estudiante(int idEstudiante){
        //super(nombre,apellidos,NIF,Direccion);
        this.idEstudiante=idEstudiante;
    }

    //metodos acceedentes y mutadores
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    public String toString(){
        return "Ocupacion estudiante\nEl id del estudiante es: "+idEstudiante;
    }
}

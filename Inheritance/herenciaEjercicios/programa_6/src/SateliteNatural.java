/**
 * Created by Martincorona007 on 22/04/2017.
 */
public class SateliteNatural {
    private String nombre;
    private String sateliteDe;

    public SateliteNatural(){

    }
    public void nombresillo(String nombre){
        this.nombre=nombre;
    }
    public void whom(String sateliteDe){
        this.sateliteDe=sateliteDe;
    }
    public String toString(){
        return "\t\t\tSATELITE\n Nombre del Satelite: "+nombre+"\n Satelite de: "+sateliteDe;
    }
}


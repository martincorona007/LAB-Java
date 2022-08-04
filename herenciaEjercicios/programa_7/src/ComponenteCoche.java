/**
 * Created by Martincorona007 on 23/04/2017.
 */
public class ComponenteCoche {
    private String descripcion;
    private double peso;
    private double costo;

    public ComponenteCoche(String descripcion, double peso, double costo) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.costo = costo;
    }

    public String toString(){
        return "Descripcion del carro: "+descripcion+"\nPeso: "+peso+"\nCosto: "+costo;
    }
}

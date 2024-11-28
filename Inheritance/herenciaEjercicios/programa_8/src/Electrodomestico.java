/**
 * Created by Martincorona007 on 24/04/2017.
 */
public class Electrodomestico {
    private  double consumo;
    private String modelo;
    public Electrodomestico(double c,String m){
        this.consumo=c;
        this.modelo=m;
    }
    public  String toString(){
        return "Modelo: "+ modelo +"\nConsumo: " +consumo+" kWh/anio" ;
    }
}
